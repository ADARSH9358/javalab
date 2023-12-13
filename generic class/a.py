import pyautogui
import pywhatkit
import time
# time.sleep(4)

count=0
while count<=5:
    # pyautogui.typewrite("Happy Marriage anversary to you mama ")
    pywhatkit.sendwhatmsg("+918077906918", "Hi", 7, 55)
    pyautogui.press("enter")
    count=count+1
