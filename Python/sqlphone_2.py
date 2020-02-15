# DML : insert, update, delete
import sqlite3

# DB 연결
conn = sqlite3.connect('phonebook')
cur = conn.cursor()

# sql 실행
sql_inserts = 'insert into phonebook values(\'son\',\'010-7777-7777\',1990)'
cur.execute(sql_inserts)

conn.commit()
cur.close()
