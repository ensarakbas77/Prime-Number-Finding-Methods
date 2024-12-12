# Asal Sayı Bulmada Kullanılan Üç Yaklaşım </br>
Asal sayı tanım olarak 1 veya kendisi hariç bir böleni olmayan sayı olarak tanımlanabilir. Burada değineceğimiz konu, asal sayı bulmada kullanılan farklı yaklaşımları göstermek olacaktır. </br> </br>
<img width="685" alt="1 açıklama" src="https://github.com/user-attachments/assets/9a641b8b-1712-403e-a1c0-31ea709faeb7" /> </br> </br>
<img width="683" alt="2 açıklama" src="https://github.com/user-attachments/assets/f667b27d-4baf-48ee-b6f8-9b09efcf42d3" /> </br> </br>
<img width="682" alt="3 açıklama" src="https://github.com/user-attachments/assets/64c62aa0-57d3-46e5-91fe-5b5e937d65b8" /> </br> </br>
# Karşılaştırma </br>
Asal sayı bulmada kullandığımız üç farklı yaklaşımı üç farklı asal sayı üzerinde karşılaştırma işlemine soktuk. Çıkan sonuçlar aşağıdaki görsellerde gösterilmiştir. </br> </br>
<img width="364" alt="1 analiz" src="https://github.com/user-attachments/assets/5664741a-7ca4-474d-9f74-8bb45778ecf8" /> </br> 
*3 farklı metodu 541 asalı için kullandığımızda sonuçlar şu şekilde gerçekleşmiştir;* </br>
**1.Yakşalım=21,33 ms** </br>
**2.Yaklaşım=1,20 ms** </br>
**3.Yaklşaım=0,21 ms** </br>
*Karşılaştrıma işlemi 1>2>3 şeklinde sıralanabilir.* </br> </br>
<img width="369" alt="2 analiz" src="https://github.com/user-attachments/assets/010e67a0-3de5-4dca-be37-4fdaefc5ee1f" /> </br> 
*3 farklı metodu 9901 asalı için kullandığımızda sonuçlar şu şekil gerçekleşmiştir;* </br>
**1.Yakşalım=20,79 ms** </br>
**2.Yaklaşım=18,96 ms** </br>
**3.Yaklşaım=0,17 ms** </br>
*Karşılaştrıma işlemi 1>2>3 şeklinde sıralanabilir.* </br> </br>
<img width="428" alt="3 analiz" src="https://github.com/user-attachments/assets/abb7217e-eefc-4e84-93ce-ddc97e77ffc9" /> </br>
*3 farklı metodu 18181 asalı için kullandığımızda sonuçlar şu şekilde gerçekleşmiştir;* </br>
**1.Yakşalım=18,24 ms** </br>
**2.Yaklaşım=50,29** </br>
**3.Yaklşaım=0,24** </br>
*Karşılaştrıma işlemi 2>1>3 şeklinde sıralanabilir.* </br> </br>
# Genel Sonuç </br>
*Asal sayı bulmada kullanılan bu üç algoritmanın zaman ve uzay karmaşıklıklarını özetlemek gerekirse;* </br> </br>
**1.Yaklaşım için** </br> 
*Time Complexity=O(N) çünkü tüm sayılar kontrol edilir.* </br> 
*Space Complexity=O(1) çünkü Ekstra bellek kullanılmaz. Yalnızca bir kaç değişken kullanılır.* </br> </br>
**2.Yaklaşım için** </br> 
*Time Complexity=O(N^2) çünkü ilk önce 1.yaklaşım ile asallar bulunur daha sonra sayımız üzerinde bölünüp bölünmediğinin kontrolü yapılır.* </br> 
*Space Complexity=O(N) Çünkü asal sayılar bir liste içinde saklanır.* </br> </br>
**3.Yaklaşım için** </br>
*Time Complexity=O(N^(1/2)) çünkü yalnızca sayının kareköküne kadar olan bölenler kontrol edilir.* </br> 
*Space Complexity=O(1) çünkü Ekstra bellek kullanılmaz.* </br> </br>
**Hangi Yaklaşım Daha İyi?** </br>
*Hızlı ve Verimli:* 3. Yaklaşım (Karekök Yaklaşımı), en hızlı ve en verimli yöntemdir, özellikle büyük sayılar için. </br>
*Liste Gereksinimi:* Eğer asal sayılar birden fazla kez kullanılacaksa 2. Yaklaşım, bu asal sayıları liste halinde tutmak açısından faydalıdır. Ancak performans olarak yavaştır.</br>
*Basitlik:* 1. Yaklaşım, en temel ve doğrudan yöntemdir, ancak verimli değildir. </br> </br>
### Not </br> 
*NanoTime Ölçümü: İşlemci, kodun çalıştığı anda işlemci döngü sayacı üzerinden geçen süreyi ölçer. Ölçüm, işlemcinin ve sistemin donanım saatine bağlıdır. 
Programın çalışma ortamına göre değişebilir (örneğin işlemci yükü, işletim sistemi zamanı etkileyebilir).
Bu süreyi yorumlarken, nanosaniye ölçümün hassasiyeti ve işletim sistemi/sistem kaynaklarının bu süreyi etkileyebileceği unutulmamalıdır.*
