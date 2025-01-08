package com.example.crud_abiel;

public class konfigurasi {
    public static final String URL_ADD = "https://10.200.5.116:3306/PM/tambahpgw.php";
    public static final String URL_GET_ALL = "https://10.200.5.116:3306/PM/tampilsemuapgw.php";
    public static final String URL_GET_EMP = "https://10.200.5.116:3306/PM/tampilpgw.php?id";
    public static final String URL_UPDATE_EMP = "https://10.200.5.116:3306/PM/updatepgw.php";
    public static final String URL_DELETE_EMP = "https://10.200.5.116:3306/PM/hapuspgw.php?id";

    //dibawah ini merupakan kunci
    public static final String KEY_EMP_ID = "id";
    public static final String KEY_EMP_NAMA = "nama";
    public static final String KEY_EMP_POSISI = "desg";
    public static final String KEY_EMP_GAJI = "salary";

    //tags json
    public static final String TAG_JSON_ARRAY="result";
    public static final String TAG_ID="id";
    public static final String TAG_name="nama";
    public static final String TAG_Posisi="desg";
    public static final String TAG_Gaji="salary";

    //ID KARYAWAN
    //EMP ITU SINGAKTAN DARI EMPLOYEE
    public static final String EMP_ID = "emp_id";

}
