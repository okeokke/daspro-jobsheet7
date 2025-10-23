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
1. ```for (int i = 1; i<=10; i++)```. int i=1 berfungsi sebagai penghitung yang dimulai dari value angka 1, dan batas pengulangan ialah jika nilai 'i' kurang dari atau sama dengan 10, dan kode apapun yang ada di dalam kurung kurawal ( {} ) akan dieksekusi selama value 'i' kurang dari atau sama dengan 10.
Dan setelah eksekusi selesai, akan ada pembaharuan, di kasus ini, nilai 'i' akan ditambah 1 value setiap eksekusi kode dalam kurung kurawal selesai sampai batas yang ditentukan yaitu 'i <= 10' tercapai, dan setelah itulah perulangan selesai dan program akan mengeksekusi kode selanjutnya setelah bagian perulangan selesai.

2. variabel '**tertinggi**' diinisialisasi dengan nilai 0 karena tujuan mencari value tertinggi dilakukan dengan mencari value yang lebih tinggi setiap perulangan mulai dari value terendah, dan untuk variabel '**terendah**' dilakukan dengan mencari value terendah dimulai dari value tertinggi dan akan terus menurun valuenya setiap menemukan value lebih rendah.
Jika value inisialisasi pada kedua variabel ditukar maka yang terjadi adalah, kondisi value yang terdapat pada if statement yang akan dicek hanya ada pada diatas 100, dan lebih rendah daripada 0.
Dan karena nilai yang kita input hanya pada rentang 0-100, nilai yang kita input berada diluar batasan pengecekan kondisi, dan value dari kedua variabel tidak berubah sampai output dan akhir program.

3. fungsi dari pernyataan if pertama tersebut adalah jika sebuah variabel '**nilai**' memiliki nilai lebih tinggi daripada variabel '**tertinggi**', maka variabel '**tertinggi**' akan di-update atau diassign nilai baru yang mengikuti nilai dari variabel '**nilai**', dan hal tersebut akan berulang mulai dari nilai/value paling rendah dan akan terus berubah menjadi value yang lebih tinggi tiap ada nilai baru dan tiap perulangan. 
Hal yang sama terjadi pada if statement selanjutnya, tetapi sekarang mencari dan meng-assign value yang lebih rendah mulai dari value tertinggi dan akan terus berulang dan meng-assign variabel '**terendah**' dengan nilai yang lebih rendah seterusnya sampai akhir perulangan. 

4. 