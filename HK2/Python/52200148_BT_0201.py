import numpy as np
#cau 1
matrix = np.array([list(range(1, 42, 5))]).reshape(3, 3)
print("1/ matrix:\n", matrix)
#cau 2
matrix_transpose = matrix.T
print("2/ matrix_transpose:\n", matrix_transpose)
#cau 3
matrix_row = matrix_transpose[:, 1::2]
matrix_row = matrix_row.T
print("3/ matrix_row:\n", matrix_row)
#cau 4
matrix_repeat = np.repeat(matrix_row, 3, axis = 0)
print("4/ matrix_repeat:\n", matrix_repeat)
#cau 5
matrix_x = matrix_repeat[0::2, :]
print("5/ matrix_x:\n", matrix_x)
#cau 6
matrix_flip = np.flipud(matrix)
print("6/ matrix_flip:\n", matrix_flip)
#cau 7
matrix_y = matrix_flip[1::2, :]
print("7/ matrix_y:\n", matrix_y)
#cau 8
print("8/ Cac phan tu duong cheo chinh cua matrix:", matrix.diagonal())