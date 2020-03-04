import serial
import paj7620.h
ard = serial.Serial(
    port='COM3',
    baudrate= 9600
    ) # Set a PORT Number & baud rate 
serial.print("\nPAJ7620U2 TEST DEMO: Recognize 15 gestures.")


def __init__(paj7620):            # initialize Paj7620 registers
    error = paj7620()     			
    if error:
        Serial.print("INIT ERROR,CODE:")
        Serial.print(error)
    elif error:
        Serial.print("INIT OK")
    else: 
        Serial.print("Please input your gestures:")

def GES_UP_FLAG():
    print('UP')
def GES_DOWN_FLAG():
    print('DOWN')
def GES_LEFT_FLAG():
    print('LEFT')
def GES_RIGHT_FLAG():
    print('RIGHT')
def GES_FORWARD_FLAG():
    print('FORWARD')
def GES_BACKWARD_FLAG():
    print('BACKWARD')
def GES_CLOCKWISE_FLAG():
    print('CLOCKWIS')
def GES_COUNT_CLOCKWISE_FLAG():
    print('COUNT_CLOCKWISE')
def GES_WAVE_FLAG():
    print('WAVE')

def GES_REACTION_TIME():800

def GES_QUIT_TIME():1000


def switch_gesture(idx):
	return {
         1: GES_UP_FLAG,
         2: GES_DOWN_FLAG,
         3: GES_LEFT_FLAG,
         4: GES_RIGHT_FLAG,
         5: GES_FORWARD_FLAG,
         6: GES_BACKWARD_FLAG,
         7: GES_CLOCKWISE_FLAG,
         8: GES_COUNT_CLOCKWISE_FLAG,
         9: GES_WAVE_FLAG
    }.get(idx,'{} is invalid index (1-9)'.format(idx))

switch_gesture(0) # '0 is invalid index (1-9)'


while True:
    if not error:
        switch_gesture(1) # 'GES_UP_FLAG'
            if data == GES_UP_FLAG:
                result = f(1),f(2)
                Serial.print("Up-Down")

                elif data == GES_FORWARD_FLAG:
                    result = f(5)
                    Serial.print("Forward")
                    delay(GES_QUIT_TIME)

                elif data == GES_BACKWARD_FLAG:
                    result = f(6)
                    Serial.print("Backward")
                    delay(GES_QUIT_TIME)

                else:
                    result = f(1)
                    Serial.print("Up")

                break
                
        switch_gesture(2) # 'GES_DOWN_FLAG'
            if data == GES_DOWN_FLAG:
                        result = f(2),f(1)
                        Serial.println("Down-Up")

                    elif data == GES_FORWARD_FLAG:
                        result = f(5)
                        Serial.println("Forward")
                        delay(GES_QUIT_TIME)

                    elif data == GES_BACKWARD_FLAG:
                        result = f(6)
                        Serial.println("Backward")
                        delay(GES_QUIT_TIME)

                    else:
                        result = f(2)
                        Serial.println("Down")

                    break

        switch_gesture(3) # 'GES_LEFT_FLAG'
                if data == GES_RIGHT_FLAG:
                        result = F(3),f(4)
                        Serial.println("Left-Right")

                    elif data == GES_FORWARD_FLAG:
                        result = f(5)
                        Serial.println("Forward")
                        delay(GES_QUIT_TIME)

                    elif data == GES_BACKWARD_FLAG:
                        result = f(6)
                        Serial.println("Backward")
                        delay(GES_QUIT_TIME)

                    else:
                        result = f(3)
                        Serial.println("Left")

                    break

        switch_gesture(4) # 'GES_RIGHT_FLAG' 
            if data == GES_LEFT_FLAG:
                        result = f(4),f(3)
                        Serial.println("Right-Left")

                    elif data == GES_FORWARD_FLAG:
                        result = f(5)
                        Serial.println("Forward")
                        delay(GES_QUIT_TIME)

                    elif data == GES_BACKWARD_FLAG:
                        result = f(6)
                        Serial.println("Backward")
                        delay(GES_QUIT_TIME)

                    else:
                        result = f(4)
                        Serial.println("Right")

                    break

        switch_gesture(5) # 'GES_FORWARD_FLAG'
            if data == GES_BACKWARD_FLAG:
                        result = f(5),f(6)
                        Serial.println("Forward-Backward")
                        delay(GES_QUIT_TIME)

                    else:
                        result = f(5)
                        Serial.println("Forward")
                        delay(GES_QUIT_TIME)

                    break

        switch_gesture(6) # 'GES_BACKWARD_FLAG'
            if data == GES_FORWARD_FLAG:
                        result = f(6),f(5)
                        Serial.println("Backward-Forward")
                        delay(GES_QUIT_TIME)

                    else:
                        result = f(6)
                        Serial.println("Backward")
                        delay(GES_QUIT_TIME)

                    break
                
        switch_gesture(7) # 'GES_CLOCKWISE_FLAG'
            result = f(7)
            Serial.println("Clockwise")

                    break

        switch_gesture(8) # 'GES_COUNT_CLOCKWISE_FLAG'
            result = f(8)
            Serial.println("anti-clockwise")

                    break

        switch_gesture(9) # 'GES_WAVE_FLAG'
            if data1 == GES_WAVE_FLAG:
                        result = f(9)
                        Serial.println("wave")

                    break
    else error:
        break

