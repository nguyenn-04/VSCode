import numpy as np
#cau 1
matrix = np.array([list(range(1, 42, 5))]).reshape(3, 3)
print("1/ matrix:\n", matrix)
#cau 2
matrix_transpose = matrix.T
print("2/ matrix:\n", matrix_transpose)
#cau 3
matrix_row = matrix_transpose[:, 0::2]
print("3/ matrix:\n", matrix_row)
#cau 4
matrix_repeat = np.repeat(matrix_row, 3, axis = 0)
print("4/ matrix:\n", matrix_repeat)
#cau 5
matrix_x = matrix_repeat[1::2, :]
print("5/ matrix:\n", matrix_x)
#cau 6
matrix_flip = np.flipud(matrix)
print("6/ matrix:\n", matrix_flip)
#cau 7
matrix_y = matrix_flip[0::2, :]
print("7/ matrix_y:\n", matrix_y)
#cau 8
print("8/ Cac phan tu duong cheo chinh cua matrix:", matrix.diagonal())