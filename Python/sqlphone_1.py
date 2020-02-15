# sqlite3
import sqlite3

# DB 연결
con = sqlite3.connect('phonebook')
cur = con.cursor()
sql_selects = 'select * from phonebook'
cur.execute(sql_selects)

while True:
    row = cur.fetchone() # 반환 행이 없으면 None을 반환
    if row == None:
        break
    print('{}\t{}\t{}\t'.format(row[0], row[1], row[2]))

con.close()
