import logging
import datetime


logger = logging.getLogger('myApp')
hand = logging.FileHandler('myApp_20200212.log')

#                               생성시간,   로그레벨,       프로세스ID,    메세지   
formatter = logging.Formatter('%(asctime)s %(levelname)s %(process)d %(message)s')

# 파일핸들러에 문자열 포메터를 등록
hand.setFormatter(formatter)

logger.addHandler(hand)

logger.setLevel(logging.INFO)

logger.debug('틀렸음~!!')
logger.info('확인~!!')
logger.warning('조심~!!')
logger.error('에러발생~!!')
logger.critical('치명적~!!')








