#Recap Primer Taller
def sacarConjuntos(gramatica, simboloInicial):

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
        
    #Llamado a Primer Taller
    print("Conjuntos de Primeros, Siguientes y Predicción: \n")

    primeros = calcular_primeros(gramatica)
    for simbolo, primeros_simbolo in primeros.items():
        print(f'PRIMEROS({simbolo}): {primeros_simbolo}')
    print(" ")

    siguientes = calcular_siguientes(gramatica, primeros, simboloInicial)
    for no_terminal, conjunto_siguientes in siguientes.items():
        print(f'SIGUIENTES({no_terminal}): {conjunto_siguientes}')
    print(" ")

    for no_terminal in gramatica.keys():
        predicciones = calcular_prediccion(gramatica, primeros, siguientes, no_terminal)
        for produccion, conjunto_predicciones in predicciones.items():
            print(f'{produccion}: {conjunto_predicciones}')
    print(" ")

    return primeros, siguientes, predicciones
            
        

        
#Segundo taller      
  
#dos funciones para recursion
def eliminar_recursion_izquierda(gramatica):
    nueva_gramatica = {}
    nuevos_no_terminales = {}

    # Crear una copia del diccionario original
    gramatica_copia = gramatica.copy()
    
    if 'E' not in gramatica_copia:
        gramatica = eliminar_recursion_izquierda_indirecta(gramatica_copia)
    else: gramatica = gramatica_copia.copy()
    
    # Creamos un nuevo no terminal para cada no terminal de la gramática
    for no_terminal in gramatica.keys():
        nuevos_no_terminales[no_terminal] = no_terminal + "'"
    
    # Revisamos cada producción para encontrar y eliminar la recursión por la izquierda
    for no_terminal, producciones in gramatica.items():
        producciones_con_recursion = []
        producciones_sin_recursion = []
        
        for produccion in producciones:
            if produccion and produccion[0] == no_terminal:
                producciones_con_recursion.append(produccion[1:] + [nuevos_no_terminales[no_terminal]])
            else:
                if 'ε' in produccion:
                    producciones_sin_recursion.append(produccion)
                else:
                    producciones_sin_recursion.append(produccion + [nuevos_no_terminales[no_terminal]])

        
        if producciones_con_recursion:
            
            # Agregar producciones con recursión por la izquierda, excepto la última
            nueva_gramatica[nuevos_no_terminales[no_terminal]] = [produccion  for produccion in producciones_con_recursion[:-1]]
            
            # Agregar la última producción con recursión por la izquierda

            nueva_gramatica[nuevos_no_terminales[no_terminal]].append(producciones_con_recursion[-1])
            
            # Agregar la producción 'ε' para el nuevo no terminal
            nueva_gramatica[nuevos_no_terminales[no_terminal]].append(['ε'])
            
            # Agregar producciones sin recursión por la izquierda
            nueva_gramatica[no_terminal] = producciones_sin_recursion
            if len(nueva_gramatica[no_terminal]) == 1 and 'ε' in nueva_gramatica[no_terminal][0]:
                nueva_gramatica[no_terminal][0] = [nuevos_no_terminales[no_terminal]]
                nueva_gramatica[no_terminal].append(['ε'])

        else:
            nueva_gramatica[no_terminal] = producciones
    
    return nueva_gramatica

def eliminar_recursion_izquierda_indirecta(gramatica):
    # Crear una copia de la gramática original
    nueva_gramatica = gramatica.copy()

    # Obtener la lista de no terminales
    no_terminales = list(nueva_gramatica.keys())
    
    # Iterar sobre los no terminales
    for i in range(len(no_terminales)):
        A = no_terminales[i]
        for j in range(i):
            B = no_terminales[j]
            # Verificar si A produce alguna cadena que comience con B
            for produccion_A in nueva_gramatica[A]:
                if produccion_A and produccion_A[0] == B:
                    # Si A produce una cadena que comienza con B, necesitamos reestructurar la gramática
                    nuevas_producciones = []
                    # Iterar sobre las producciones de A y reescribir las que comienzan con B
                    for produccion_A_actual in nueva_gramatica[A]:
                        # Verificar si la producción actual de A comienza con B
                        if produccion_A_actual[0] == B:
                            # Reescribir la producción eliminando la parte que comienza con B
                            nueva_produccion_A_actual = produccion_A_actual[1:]
                            # Agregar las nuevas producciones de A
                            nuevas_producciones.extend([produccion_B + nueva_produccion_A_actual for produccion_B in nueva_gramatica[B]])
                            for produccion in nuevas_producciones:
                                if 'ε' in produccion:
                                    produccion.remove('ε')
                        else:
                            # Conservar las producciones que no comienzan con B
                            nuevas_producciones.append(produccion_A_actual)
                    # Actualizar la gramática para el no terminal A
                    nueva_gramatica[A] = nuevas_producciones

    return nueva_gramatica
    
    
    
#dos funciones para factorizar    
def eliminar_factores_comunes_izquierda(gramatica):
    nueva_gramatica = {}

    for no_terminal, producciones in gramatica.items():
        grupos_factores_comunes = {}
        nuevas_producciones = []
        pres = []

        pres = prefijos(producciones, 0, pres)

        # Verificar si hay factores comunes
        if pres:
            # Agrupar producciones por el primer símbolo
            for produccion in producciones:
                todos_presentes = all(elemento in produccion for elemento in pres)
                if todos_presentes:
                    if str(pres) not in grupos_factores_comunes:
                        grupos_factores_comunes[str(pres)] = []
                    grupos_factores_comunes[str(pres)].append(produccion)
                else:
                    nuevas_producciones.append(produccion)

            # Procesar grupos de producciones
            for pref, grupo in grupos_factores_comunes.items():
                # Si hay factores comunes
                if len(grupo) > 1:
                    # Crear un nuevo no terminal para el grupo
                    nuevo_no_terminal = no_terminal + "'"
                    nueva_gramatica[nuevo_no_terminal] = [produccion[len(pres):] for produccion in grupo]
                    pr = pres
                    pr.append(nuevo_no_terminal)
                    nuevas_producciones.append(pr)

                else:
                    nuevas_producciones.append(grupo[0])
        else:
            # No hay factores comunes, simplemente agregar las producciones originales
            nuevas_producciones = producciones

        # Actualizar la gramática con las nuevas producciones
        nueva_gramatica[no_terminal] = nuevas_producciones

    return nueva_gramatica

def prefijos(producciones, indice, pres):
    prods_comunes = []
    pref = []
    pref = pres

    for produccion1 in producciones:
        index = producciones.index(produccion1)
        if index < len(producciones)-1:
            for produccion2 in producciones[(index+1):]:
                if len(produccion1) > indice and len(produccion2) > indice:  # Verificar que los índices sean válidos
                    if produccion1[indice] == produccion2[indice]:
                        if produccion1 in prods_comunes:
                            prods_comunes.remove(produccion1)
                        prods_comunes.append(produccion1)
                        prods_comunes.append(produccion2)

        if prods_comunes != []:
            if len(produccion1) > indice:  # Verificar que el índice sea válido
                pref.append(produccion1[indice])
                return prefijos(prods_comunes, indice + 1, pref)
    return pref
    


def imprimir_gramatica(gramatica):
    for no_terminal, producciones in gramatica.items():
        print(f"{no_terminal} -> ", end="")
        for i, produccion in enumerate(producciones):
            if i > 0:
                print(" | ", end="")
            print(" ".join(str(simbolo) for simbolo in produccion), end="")
        print()



# Ejercicio1 de la presentación 10
"""
gramatica = {
    'S': [['A', 'B', 'C'], ['D','E']],
    'A': [['dos', 'B', 'tres'], ['ε']],
    'B': [['B', 'cuatro', 'C', 'cinco'], ['ε']],
    'C': [['seis','A', 'B'], ['ε']],
    'D': [['uno', 'A', 'E'], ['B']],
    'E': [['tres']]
}
simbolo_inicial = 'S'
"""

#Ejercicio 2 la presentación 10 
"""
gramatica = {
    'S': [['B','uno'], ['dos', 'C'], ['ε']],
    'A': [['S', 'tres','B', 'C'], ['cuatro'], ['ε']],
    'B': [['A', 'cinco', 'C', 'seis'], ['ε']],
    'C': [['siete', 'B'], ['ε']],
}
simbolo_inicial = 'S'
"""

#Ejercicio 3 la presentación 10
"""
gramatica = {
    'S': [['A', 'B', 'C'], ['S','uno']],
    'A': [['dos', 'B','C'], ['ε']],
    'B': [['C', 'tres'], ['ε']],
    'C': [['cuatro', 'B'], ['ε']],
}
simbolo_inicial = 'S'
"""

# Ejemplo recursividad izquierda
"""
gramatica = {
    'E': [['E', '+', 'T'], ['E', '-', 'T'], ['T']],
    'T': [['T', '*', 'F'], ['T', '/', 'F'], ['F']], 
    'F': [['(', 'E',')'], ['ident']],
}
simbolo_inicial = 'E' 
"""

#Ejemplo Factor comun izquierda
"""
gramatica = {
    'S': [['uno', 'S', 'dos'], ['uno', 'S', 'tres'], ['ε']],
    'A': [['uno', 'A', 'cuatro'], ['ε']],
}
simbolo_inicial = 'S'
"""

#Ejemplo Factor comun izquierda
"""
gramatica = {
    'Inst': [['if', 'E', 'then', 'Inst', 'endif'], ['if', 'E', 'then', 'Inst', 'else', 'Inst', 'endif']],
}
simbolo_inicial = 'Inst'
"""

#Llamados a Segundo Taller
print("\nSegundo Taller: Transformación a LL(1): \n")
print("Gramática dada:")
imprimir_gramatica(gramatica)

gramatica_sin_recursion = eliminar_recursion_izquierda(gramatica)
print("\nGramática sin recursión por la izquierda:")
imprimir_gramatica(gramatica_sin_recursion)

gramatica_sin_factores = eliminar_factores_comunes_izquierda(gramatica_sin_recursion)
print("\nGramatica sin factores: ")
imprimir_gramatica(gramatica_sin_factores)


#Llamado a Primer Taller
print("\n\nConjuntos de la Gramática Transformada: ")
sacarConjuntos(gramatica_sin_factores, simbolo_inicial)
