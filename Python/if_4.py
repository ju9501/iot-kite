# if_3.py -> 개선 if else 구문으로 처리
# 양의 정수 입력 받기
number = input('양의 정수를 입력해주세요 >> ')

# 정수 데이터로 형 변환
int_num = int(number)

if int_num>0:
    # 마지막 자리수 추출
    last_char = number[-1]     #1004 -> 4

    # 짝수
    if last_char in "02468":
        print("짝수입니다.")
    else:
        print("홀수입니다.")    

    if int_num%2 == 0:
        print("짝수입니다.")  
    else:
        print("홀수입니다.")    

else:
    print('양의정수가 아닙니다. 프로그램을 종료합니다.')


#if int_num<0:
#    print('양의정수가 아닙니다. 프로그램을 종료합니다.')




