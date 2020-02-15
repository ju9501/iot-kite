# 데이터 저장용 list 선언, 데이터 입력
# student = [
#     {'name':'Scott','korean':87,'math':90, 'english':90, 'science':70},
#     {'name':'KING','korean':93,'math':65, 'english':90, 'science':88},
#     {'name':'Adam','korean':91,'math':60, 'english':100, 'science':80},
#     {'name':'Smith','korean':88,'math':95, 'english':90, 'science':75},
#     {'name':'Son','korean':78,'math':92, 'english':88, 'science':77},
#     {'name':'Lee','korean':86,'math':93, 'english':95, 'science':60},
#     {'name':'Kim','korean':70,'math':95, 'english':80, 'science':90},
# ]


# Student Class 정의
class Student:
    # Constructor 정의 
    def __init__(self, name, kor, math, eng, sci):
        self.name=name
        self.korean=kor
        self.math=math
        self.english=eng
        self.science=sci

    # 각 과목의 점수의 합을 구해 반환하는 메서드
    def score_sum(self):
        return self.korean+self.math+self.english+self.science

    # 각 과목의 평균값을 구해 반환하는 메서드
    def score_avg(self):
        return self.score_sum()/4     


# class를 이용한 인스턴스 생성
# st_a = Student()
# print(type(st_a))

# st_a.name = 'son' # st_a 객체에 name 속성을 동적 추가 (자바에서는 불가능)
# print(st_a.name)

# st_b = Student()
# print(type(st_b))
# print(st_b.name)

#1. list에 추가할 Object를 만드는 함수
def makeStudent1(name, kor, math, eng, sci):
    return{
        'name': name,
        'korean': kor,
        'math': math, 
        'english': eng, 
        'science': sci
        }

#2. list에 추가할 Object를 Class를 이용해서 만드는 함수
# def makeStudent_class(name, kor, math, eng, sci):
#     st_temp = Student()
#     st_temp.name = name
#     st_temp.korean = kor
#     st_temp.math = math
#     st_temp.english = eng
#     st_temp.science = sci
#     return st_temp

# Student class 를 이용한 Object 생성
students = [
    Student('Scott',87,90,90,70),
    Student('KING',93,65,90,88),
    Student('Adam',91,60,100,80),
    Student('Smith',88,95,90,75),
    Student('Son',78,92,88,77),
    Student('Lee',86,93,95,60),
    Student('Kim',70,95,80,90)
    ]

# 학생들의 이름, 총점, 평균 
#print('이름', '총점', '평균', sep='\t')


# 학생 리스트 반복 출력 
for st in students:
    # dic 참조
    #score_sum = st['korean']+st['english']+st['math']+st['science']

    # class instance 속성 참조
    #score_sum = st.korean + st.english + st.math + st.science
    #score_avg = score_sum/4
    #print(st['name'], score_sum, score_avg, sep='\t')
    # class instance 속성 참조
    #print(st.name, score_sum, score_avg, sep='\t')
    print(st.name, st.score_sum(), st.score_avg(), sep='\t')












