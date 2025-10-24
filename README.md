## Percobaan 1
### Pertanyaan
1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program Percobaan 1
2. Mengapa  variabel  tertinggi  diinisialisasi  0  dan  terendah  diinisialisasi  100?  Apa  yang terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0? 
3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!
```
if (nilai > tertinggi) {
    tertinggi = nilai;
}
if (nilai < terendah) {
    terendah = nilai;
}
```
4 . Modifikasi  kode  program  sehingga  terdapat  perhitungan  untuk  menentukan  berapa mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60). Tampilkan  jumlah  mahasiswa  lulus  dan  tidak  lulus setelah  menampilkan  nilai  tertinggi dan terendah!

### Jawaban
1. ```for (int i = 1; i<=10; i++)```. int i=1 berfungsi sebagai penghitung yang dimulai dari value angka 1, dan batas pengulangan ialah jika nilai 'i' kurang dari atau sama dengan 10, dan kode apapun yang ada di dalam kurung kurawal ( {} ) akan dieksekusi selama value 'i' kurang dari atau sama dengan 10.\
Dan setelah eksekusi selesai, akan ada pembaharuan, di kasus ini, nilai 'i' akan ditambah 1 value setiap eksekusi kode dalam kurung kurawal selesai sampai batas yang ditentukan yaitu 'i <= 10' tercapai, dan setelah itulah perulangan selesai dan program akan mengeksekusi kode selanjutnya setelah bagian perulangan selesai.

2. variabel '**tertinggi**' diinisialisasi dengan nilai 0 karena tujuan mencari value tertinggi dilakukan dengan mencari value yang lebih tinggi setiap perulangan mulai dari value terendah, dan untuk variabel '**terendah**' dilakukan dengan mencari value terendah dimulai dari value tertinggi dan akan terus menurun valuenya setiap menemukan value lebih rendah.\
Jika value inisialisasi pada kedua variabel ditukar maka yang terjadi adalah, kondisi value yang terdapat pada if statement yang akan dicek hanya ada pada diatas 100, dan lebih rendah daripada 0.\
Dan karena nilai yang kita input hanya pada rentang 0-100, nilai yang kita input berada diluar batasan pengecekan kondisi, dan value dari kedua variabel tidak berubah sampai output dan akhir program.

3. fungsi dari pernyataan if pertama tersebut adalah jika sebuah variabel '**nilai**' memiliki nilai lebih tinggi daripada variabel '**tertinggi**', maka variabel '**tertinggi**' akan di-update atau diassign nilai baru yang mengikuti nilai dari variabel '**nilai**', dan hal tersebut akan berulang mulai dari nilai/value paling rendah dan akan terus berubah menjadi value yang lebih tinggi tiap ada nilai baru dan tiap perulangan.\
Hal yang sama terjadi pada if statement selanjutnya, tetapi sekarang mencari dan meng-assign value yang lebih rendah mulai dari value tertinggi dan akan terus berulang dan meng-assign variabel '**terendah**' dengan nilai yang lebih rendah seterusnya sampai akhir perulangan. 

4. [SiakadFor08.java](https://github.com/okeokke/daspro-jobsheet7/blob/main/SiakadFor08.java)



## Percobaan 2
### Pertanyaan
1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut :
```java
if (nilai<0 || nilai>100) {
    System.out.println("Nilai tidak valid. masukkan lagi nilai yang valid!");
    continue;
}
```
- a. nilai < 0 || nilai > 100\
b. continue

2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya dituliskan di awal perulangan WHILE? 

3. Apabila  jumlah  mahasiswa  yang  dimasukkan  adalah  19,  berapa  kali  perulangan  WHILE akan berjalan? 

4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A, program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!
5. Commit dan push kode program ke Github

### Jawaban
1. A. Berguna untuk memastikan jika ada value di luar 0-100, maka akan dilakukan eksekusi if statement yang dilanjutkan ke perintah continue\
B. continue berfungsi untuk melewati sisa kode selanjutnya di dalam bagian perulangan dan mengulang kode dari awal perulangan

2. i++ berarti variabel i akan digunakan terlebih dahulu setelah itu ditambah 1 value. jika i++ diletakkan di awal WHILE, maka variabel i akan digunakan sebelum kode apapun dan akan ditambah 1 value. dan karena di dalam sisa kode while nilai i ditambah 1 value lagi, urutan penghitung mahasiswa akan menghasilkan value 2, secara efektif mengubah deklarasi var. penghitung i=0 di awal menjadi i=1 karena penambahan juga terjadi di awal sebelum bagian lain kode dieksekusi.

3. 19 kali, karena penghitung dimulai dari value 0 sebagai hitungan pertama dan value 18 sebagai hitungan terakhir karena kondisi yang diatur adalah variabel i (yang dimulai dari value 0) harus kurang dari value variabel jml dengan value 19 yang menghasilkan 19 pasang angka dimulai dari value 0 sebagai hitungan pertama.

4. & 5. [SiakadWhile08.java](https://github.com/okeokke/daspro-jobsheet7/blob/main/SiakadWhile08.java)\
Sebelum modifikasi\
![Output sebelum modifikasi](https://github.com/okeokke/daspro-jobsheet7/blob/main/Before_Per2.png)\
Setelah Modifikasi\
![Output sebelum modifikasi](https://github.com/okeokke/daspro-jobsheet7/blob/main/After_Per2.png)