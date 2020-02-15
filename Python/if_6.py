# Bool 타입으로 치환되는 상황
# 0 -> False
# None -> False
# 0 -> False
# 빈 문자열 "" -> False
# 빈 list -> False

num = 10
str_blank = ""
nums = [1,2,3]

if num:
    print("num은 True 처리가 됩니다.")
else:
    print("0은 False 처리가 됩니다.")


if str_blank:
    print("문자열은 True 처리가 됩니다.")
else:
    print("빈 문자열은 False 처리가 됩니다.")


if nums:
    print("list는 True 처리가 됩니다.")
else:
    print("빈 list은 False 처리가 됩니다.")
