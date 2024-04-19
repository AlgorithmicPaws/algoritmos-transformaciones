#funcion principal
def calcular_primeros(gramatica):
    primeros = {}
    
    # Función auxiliar para determinar si un símbolo es terminal
    def es_terminal(simbolo):
        return simbolo not in gramatica.keys()

    
    # Función recursiva para calcular los primeros de un símbolo
    # PRIMEROS(αlpha) = primeros
    # PRIMEROS(a1) = primeros_del_simbolo
    def calcular_primeros_rec(simbolo):
        # Si ya hemos calculado los primeros para este símbolo, regresar
        if simbolo in primeros:
            return primeros[simbolo]
        
        primeros[simbolo] = set()
        
        # Regla 1: Si es épsilon, agregar épsilon
        if simbolo == 'ε':
            primeros[simbolo].add('ε')
            return primeros[simbolo]
        
        #symbol itera todos los no term. y simbolo es la regla actual
        for produccion in gramatica[simbolo]:
            # Regla 2a: Si es un terminal, agregarlo
            if es_terminal(produccion[0]):
                primeros[simbolo].add(produccion[0])
            # Regla 2b, 2c, 2d: Si es un no terminal, calcular primeros recursivamente
            else:
                for i, symbol in enumerate(produccion):
                    if es_terminal(symbol):
                        primeros[simbolo].add(symbol)
                        break
                    #regla 2d: se llama recursivamente 
                    primeros_del_simbolo = calcular_primeros_rec(symbol)
                    #regla 2b: restando epsilon
                    primeros[simbolo].update(primeros_del_simbolo - {'ε'})
                    if 'ε' not in primeros_del_simbolo:
                        break
                    #regla 2c: n=1
                    if i == len(produccion) - 1:
                        primeros[simbolo].add('ε')
        
        return primeros[simbolo]
    
    # Calcular primeros para cada símbolo de la gramática
    for simbolo in gramatica:
        calcular_primeros_rec(simbolo)
    
    return primeros
    

def calcular_siguientes(gramatica, primeros, simbolo_inicial):

    no_terminales = set(gramatica.keys())
    siguientes = {no_terminal: set() for no_terminal in no_terminales}

    # Regla 1: Si A es el símbolo inicial de la gramática, añadir $ a SIGUIENTES(A)
    siguientes[simbolo_inicial].add('$')
    
    # Función auxiliar para calcular los siguientes de un no terminal
    def calcular_siguientes_rec(no_terminal):
        for nt, producciones in gramatica.items():
            for produccion in producciones:
                if no_terminal in produccion:
                    index = produccion.index(no_terminal)
                    # Regla 2a: Añadir PRIMEROS(β) - {ε} a SIGUIENTES(A)
                    siguiente_simbolo = produccion[index + 1] if index < len(produccion) - 1 else None
                    if siguiente_simbolo is not None:
                        if siguiente_simbolo in no_terminales:
                            siguientes[no_terminal].update(primeros[siguiente_simbolo] - {'ε'})
                        else:
                            siguientes[no_terminal].add(siguiente_simbolo)
                    # Regla 2b: Si ε está en PRIMEROS(β) o β = ε, entonces añadir SIGUIENTES(B) a SIGUIENTES(A)
                   
                    if (siguiente_simbolo is None) or ('ε' in primeros.get(siguiente_simbolo, [])):
                        siguientes[no_terminal].update(siguientes[nt])

                    
    # Iterar hasta que no se puedan añadir más símbolos a los siguientes
    cambios = True
    while cambios:
        cambios = False
        for no_terminal in no_terminales:
            antes = set(siguientes[no_terminal])
            calcular_siguientes_rec(no_terminal)
            if antes != siguientes[no_terminal]:
                cambios = True

    return siguientes
    
def calcular_prediccion(gramatica, primeros, siguientes, no_terminal):
    prediccion = set()
    
    for regla in gramatica[no_terminal]:
         prediccion.add(no_terminal+'->'+''.join(regla))
    predicciones = {predicc: set() for predicc in prediccion}
    
    for produccion in gramatica[no_terminal]:
        predic = no_terminal+'->'+''.join(produccion)
    	
        if produccion[0] in gramatica.keys():
            predicciones[predic] = calcular_prediccion_rec(predicciones, produccion, predic, primeros, 0)
        else:
            if produccion[0] =='ε':
                predicciones[predic].update(siguientes[no_terminal])
            else:
                predicciones[predic]= produccion[0]

    return predicciones
      
      
def calcular_prediccion_rec(predicciones, produccion, predic, primeros, it_regla):
    if (len(produccion)) != it_regla:
        if produccion[it_regla] in gramatica.keys():
            predicciones[predic].update(primeros[produccion[it_regla]]- {'ε'})
            if 'ε' in primeros[produccion[it_regla]]:
                return calcular_prediccion_rec(predicciones, produccion, predic, primeros, it_regla+1)
            else:
                return predicciones[predic]
        else:
            
            predicciones[predic].add(produccion[it_regla])
            return predicciones[predic]
    else:
        return predicciones[predic]
        

def eliminar_recursion_izquierda(gramatica):
    nueva_gramatica = {}
    nuevos_no_terminales = {}
    
    # Creamos un nuevo no terminal para cada no terminal de la gramática
    for no_terminal in gramatica.keys():
        nuevos_no_terminales[no_terminal] = no_terminal + "'"
    
    # Revisamos cada producción para encontrar y eliminar la recursión por la izquierda
    for no_terminal, producciones in gramatica.items():
        producciones_con_recursion = []
        producciones_sin_recursion = []
        
        for produccion in producciones:
            if produccion[0] == no_terminal:
                producciones_con_recursion.append(produccion[1:] + [nuevos_no_terminales[no_terminal]])
            else:
                producciones_sin_recursion.append(produccion[:])  # Creamos una copia de la producción
        
        if producciones_con_recursion:
            # Agregar producciones con recursión por la izquierda, excepto la última
            nueva_gramatica[nuevos_no_terminales[no_terminal]] = [produccion + [nuevos_no_terminales[no_terminal]] for produccion in producciones_con_recursion[:-1]]
            
            # Agregar la última producción con recursión por la izquierda
            nueva_gramatica[nuevos_no_terminales[no_terminal]].append(producciones_con_recursion[-1])
            
            # Agregar la producción 'ε' para el nuevo no terminal
            nueva_gramatica[nuevos_no_terminales[no_terminal]].append(['ε'])
            
            # Agregar producciones sin recursión por la izquierda
            nueva_gramatica[no_terminal] = producciones_sin_recursion
            
            # Modificar las producciones sin recursión por la izquierda para incluir el nuevo no terminal
            for produccion in nueva_gramatica[no_terminal]:
                if 'ε' not in produccion:
                    produccion.append(nuevos_no_terminales[no_terminal])
        else:
            nueva_gramatica[no_terminal] = producciones
    
    return nueva_gramatica


def eliminar_factores_comunes_izquierda(gramatica):
    nueva_gramatica = {}

    for no_terminal, producciones in gramatica.items():
        grupos_factores_comunes = {}
        nuevas_producciones = []
        prefijos = {}
        
        #yo
        """
        for produccion in producciones:
            for i in range(len(produccion)-1):
                simbolo = produccion[i]
                if simbolo not in grupos_factores_comunes:
                    grupos_factores_comunes[simbolo] = []
                grupos_factores_comunes[primer_simbolo].append(produccion)
         """   
        # Agrupar producciones por el primer símbolo
        for produccion in producciones:
            primer_simbolo = produccion[0]
            if primer_simbolo not in grupos_factores_comunes:
                grupos_factores_comunes[primer_simbolo] = []
            grupos_factores_comunes[primer_simbolo].append(produccion)
        
        # Procesar grupos de producciones
        for prefijo, grupo in grupos_factores_comunes.items():
            print(prefijo)
            print(grupo)
            # Si hay factores comunes
            if len(grupo) > 1:
                # Crear un nuevo no terminal para el grupo
                nuevo_no_terminal = no_terminal + "'"
                nueva_gramatica[nuevo_no_terminal] = [produccion[1:] for produccion in grupo]
                nuevas_producciones.append([prefijo, nuevo_no_terminal])
            else:
                nuevas_producciones.append(grupo[0])

        # Actualizar la gramática con las nuevas producciones
        nueva_gramatica[no_terminal] = nuevas_producciones

    return nueva_gramatica



def imprimir_gramatica(gramatica):
    for no_terminal, producciones in gramatica.items():
        print(f"{no_terminal} -> ", end="")
        for i, produccion in enumerate(producciones):
            if i > 0:
                print(" | ", end="")
            print(" ".join(produccion), end="")
        print()


# Ejercicio1 de diapositivas del profe
"""
gramatica = {
    'S': [['A', 'uno', 'B', 'C'], ['S','dos']],
    'A': [['B', 'C', 'D'], ['A', 'tres'], ['ε']],
    'B': [['D', 'cuatro', 'C', 'tres'], ['ε']],
    'C': [['cinco','D', 'B'], ['ε']],
    'D': [['seis'], ['ε']]
}
simbolo_inicial = 'S'
"""

# Ejercicio2 de diapositivas del profe
"""
gramatica = {
    'S': [['A', 'B', 'uno']],
    'A': [['dos', 'B'], ['ε']],
    'B': [['C', 'D'], ['tres'], ['ε']],
    'C': [['cuatro','A', 'B'], ['cinco']],
    'D': [['seis'], ['ε']]
}
simbolo_inicial = 'S' 
"""

# Ejemplo de diapositivas del profe
"""
gramatica = {
    'A': [['B', 'C'], ['ant', 'A', 'all']],
    'B': [['big', 'C'], ['bus', 'A', 'boss'], ['ε']],
    'C': [['cat'], ['cow']],
}
simbolo_inicial = 'A' 
"""

# Ejercicio random youtube
"""
gramatica = {
    'E': [['T', 'R']],
    'R': [['+', 'T','R'], ['ε']],
    'T': [['F','L']], 
    'L': [['*', 'F','L'], ['ε']],
    'F': [['(', 'E',')'], ['ident']],
}
simbolo_inicial = 'E' 
"""

# Ejercicio random prueba1
"""
gramatica = {
    'S': [['A', 'B']],
    'A': [['a', 'A'], ['ε']],
    'B': [['b']], 
}
simbolo_inicial = 'S' 
"""

#Ejercicio 2 diapositivas 10
"""
gramatica = {
    'S': [['B','uno'], ['dos', 'C'], ['ε']],
    'A': [['S', 'tres','B', 'C'], ['cuatro'], ['ε']],
    'B': [['A', 'cinco', 'C', 'seis'], ['ε']],
    'C': [['siete', 'B'], ['ε']],
}
simbolo_inicial = 'S'
"""

#Ejercicio 3 diapositivas 10
"""
gramatica = {
    'S': [['A', 'B', 'C'], ['S','uno']],
    'A': [['dos', 'B','C'], ['ε']],
    'B': [['C', 'tres'], ['ε']],
    'C': [['cuatro', 'B'], ['ε']],
}
simbolo_inicial = 'S'
"""

#Factor comun izquierda

gramatica = {
    'S': [['uno', 'S', 'dos'], ['uno', 'S', 'tres'], ['ε']],
    'A': [['uno', 'A', 'cuatro'], ['ε']],
}
simbolo_inicial = 'S'


#Factor comun izquierda
"""
gramatica = {
    'Inst': [['if', 'E', 'then', 'Inst', 'endif'], ['if', 'E', 'then', 'Inst', 'else', 'Inst', 'endif']],
}
simbolo_inicial = 'Inst'
"""

#llamar a la funcion principal
primeros = calcular_primeros(gramatica)
for simbolo, primeros_simbolo in primeros.items():
    print(f'PRIMEROS({simbolo}): {primeros_simbolo}')

siguientes = calcular_siguientes(gramatica, primeros, simbolo_inicial)
for no_terminal, conjunto_siguientes in siguientes.items():
    print(f'SIGUIENTES({no_terminal}): {conjunto_siguientes}')


for no_terminal in gramatica.keys():
    predicciones = calcular_prediccion(gramatica, primeros, siguientes, no_terminal)
    for produccion, conjunto_predicciones in predicciones.items():
        print(f'{produccion}: {conjunto_predicciones}')


# Imprimir la nueva gramática
print("Gramática normal:")
imprimir_gramatica(gramatica)

# Eliminar recursión por la izquierda
gramatica_sin_recursion = eliminar_recursion_izquierda(gramatica)

# Imprimir la nueva gramática
print("Gramática normal2:")
imprimir_gramatica(gramatica)

# Imprimir la nueva gramática
print("Gramática sin recursión por la izquierda:")
imprimir_gramatica(gramatica_sin_recursion)