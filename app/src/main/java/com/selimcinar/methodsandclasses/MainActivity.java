package com.selimcinar.methodsandclasses;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.PersistableBundle;

public class MainActivity extends AppCompatActivity {
    //Global , Local değişkenler
    //Global değişken
    String username="";
    String musician1;
    String musician2;
    int age1;
    int age2;
    String instrument;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    //Aktivite ilk oluştuğunda onCreate çalışır



        System.out.println("on create called");
        testMethod();
        System.out.println(math(3,5));
        System.out.println(newMethod("Selim"));
        username="James"; // global değişkene değer atama
        musician1="lars";
        musician2="kirk" ;
        age1=5;
        age2=25;

        makeMusicians();

        makeSimpsons();

    }
    //Sınıf en büyük parça metotlar küçük parça
    //Birden fazla aktivite birden fazla sınıf ve birden fazla metot olabilir.

    //Metot yazma
    //Erişilebilirlilik seviyeleri public halka açık protected korunmuş,private gizli

    //Halka açık geriye değer döndürmeyen(return yok) adı testMethod olan metot
    //Görünüm tarafından çağrılacaksa View:

    //Class oluşturma metot içinde

    public void  makeSimpsons(){
        Simpsons homer = new Simpsons("Homer",50,"Nuclear");
        //Constructorda değişkenin değerini değiştirme
        //Getter olayı değer yazdırma
        System.out.println(homer.getName());

        //Private öğelerde Getter ve setter ile değişken değiştirme yada yazdırma
        //Setter olayı değer değiştirme
        homer.setName("Homer Simpson");
        //Getter olayı değer çağırma yazdırma
        System.out.println(homer.getName());
    }


    public void  makeMusicians(){

        //Constructor yapma
        Musicians james = new Musicians("James","Guitar",50);
        System.out.println(james.instrument);
    }




    public void testMethod(){
        //Global değişkene değer atama
        username="Lars";
        //Local değişkene değer atama
        int x = 4 + 4;
        System.out.println("value of x : "+ x);
    }
    //Halka açık geriye değer döndüren (return var ) adı math
    public int math(int a , int b){ // a ve b parametreleri eklendi
        //global değişkene değer atama
        username="kirk";
        int x = 11;
        System.out.println("value of x in math " + x);
        return a + b; // parametrelerden gelecek a ve b değerlerinin toplamını döndürecek
    }
    //Halka açık String veri tipli değer döndüren (return var ) adı newMethod
    public String newMethod(String string){
       //Global değişkene değer atama
        username="Rob";
        return  string + "new method"; // string paremetresine gelen değeri ve new methodu yazdıracak
    }


    @Override
    protected void onResume() {
        //Aktivite oluşumundan sonraki devam eden süreçte.
        super.onResume();
        System.out.println("on resume called");

    }

    @Override
    protected void onStop() {
        //geçici duraklatıldığında
        super.onStop();
        System.out.println("on stop called");
    }

    @Override
    protected void onPause() {
        // tamamen duraklatıldığında
        super.onPause();
        System.out.println("on pause called");
    }


}