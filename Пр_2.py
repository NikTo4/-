import random

rows_a = int(input("Введите количество строк первой матрицы: "))
cols_a = int(input("Введите количество столбцов первой матрицы: "))

rows_b = int(input("Введите количество строк второй матрицы: "))
cols_b = int(input("Введите количество столбцов второй матрицы: "))

if cols_a != rows_b:
    print("Ошибка: Умножение невозможно!")
else:
    matrix_a = [[random.randint(0, 10) for _ in range(cols_a)] for _ in range(rows_a)]
    matrix_b = [[random.randint(0, 10) for _ in range(cols_b)] for _ in range(rows_b)]
    
    print("\nПервая матрица:")
    for row in matrix_a:
        print(row)
    
    print("\nВторая матрица:")
    for row in matrix_b:
        print(row)
    
    result = [[0 for _ in range(cols_b)] for _ in range(rows_a)]
    
    for i in range(rows_a):
        for j in range(cols_b):
            for k in range(cols_a):
                result[i][j] += matrix_a[i][k] * matrix_b[k][j]
    
    print("\nРезультат умножения:")
    for row in result:
        print(row)