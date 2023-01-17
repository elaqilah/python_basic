def login(name,password):
    sukses = False
    file = open("logindatabase.txt","r")
    for i in file:
        a,b = i.split(",")
        b , b.strip()
        if(a==name and b==password):
            sukses = True
            break
    file.close()
    if(sukses):
        print("login berhasil,silahkan masuk")
    else:
        print("anda belum register,silahkan register")
def register(name,password):
    file = open("logindatabase.txt","a")
    file.write("\n"+name+","+password)
    
def access(option):
    global name 
    if(option == "login"):
        name = input("masukkan ID :")
        password = input("masukkan password :")
        login(name,password)
    else:
        print("masukkan ID dan password anda yang baru")
        name = input("masukkan ID :")
        password = input("masukkan password :")
        register(name,password)
        print("register anda berhasil,silahkan masuk")
        
def begin():
    global option
    print("selamat datang di program login")
    print("selamat datang di program login")
    print("selamat datang di program login")
    option = input("silahkan masukkan(login/reg) :")
    if(option!="login" and option!="reg"):
        begin()
        
begin()
access(option)