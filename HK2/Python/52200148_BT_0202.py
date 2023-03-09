import numpy as np
import random
#cau 1
create_list = [random.randint(1, 10) for i in range(25)]
print("1/ create_list:\n", create_list)
#cau 2
vector_row = np.array(create_list)
print("2/ vector_row:\n", vector_row)
#cau 3
matrix_55 = vector_row.reshape(5, 5)
print("3/ matrix_55:\n", matrix_55)
#cau 4
matrix_T = matrix_55.T
print("4/ matrix_T:\n", matrix_T)
#cau 5
matrix_25 = matrix_55[:2, :5]
print("5/ matrix_25:\n", matrix_25)
#cau 6
#Để nhân ma trận, số lượng cột trong ma trận thứ nhất phải bằng số lượng hàng trong ma trận thứ hai
#https://vi.wikipedia.org/wiki/Ph%C3%A9p_nh%C3%A2n_ma_tr%E1%BA%ADn#:~:text=%C4%90%E1%BB%83%20nh%C3%A2n%20ma%20tr%E1%BA%ADn%2C%20s%E1%BB%91,trong%20ma%20tr%E1%BA%ADn%20th%E1%BB%A9%20hai.
#cau 7

#https://svnckh.edu.vn/phep-nhan-ma-tran-phep-nhan-2-ma-tran-dinh-nghia-ma-tran-la-gi/
#cau 8
matrix_result_option = np.dot(matrix_25, matrix_T)
print("8/ matrix_result_option:\n", matrix_result_option)