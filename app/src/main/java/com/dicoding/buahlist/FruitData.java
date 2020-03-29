package com.dicoding.buahlist;

import java.util.ArrayList;

public class FruitData {
    private static String[] fruitNames = {
            "Apel",
            "Jeruk",
            "Mangga",
            "Pepaya",
            "Pisang",
            "Strawberry",
            "Nanas",
            "Avocado",
            "Anggur",
            "Kiwi",
            "Buah Naga",
            "Semangka",
            "Tomat"
    };

    private static String[] fruitDetails = {
            "Manfaat Buah Apel bagi Kesehatan\n" +
                    "Buah yang berasal dari Pohon Apel (nama ilmiah disebut dengan Malus domestica) ini mempunyai banyak manfaat bagi kita yang mengkonsumsinya. Manfaat-manfaat buah apel diantaranya adalah sebagai berikut :\n" +
                    "\n\n1. Mencegah Risiko Alzheimer\n" +
                    "Sebuah penelitian baru yang dilakukan pada tikus menunjukan bahwa minum jus buah apel dapat melawan efek penuaan pada otak dan mencegah penyakit Alzheimer. Tikus yang diberikan diet apel tersebut menunjukan adanya peningkatan level neurotransmitter asetilkolin dan dapat melakukan tes labirin (maze) lebih baik dibandingkan dengan tikus yang diberikan diet regular. Sebagai catatan, Alzheimer adalah kelainan yang ditandakan dengan adanya penurunan daya ingat dan juga penurunan kemampuan berbicara dan berpikir.\n" +
                    "\n\n2. Menurunkan kadar Kolesterol\n" +
                    "Serat larut yang terdapat pada apel akan mengikat lemak di usus sehingga dapat menurunkan kadar kolesterol.\n" +
                    "\n\n3. Mengendalikan Berat Badan\n" +
                    "Berat Badan yang berlebihan merupakan salah satu penyebab timbulnya berbagai masalah kesehatan seperti penyakit jantung, stroke, tekanan darah tinggi, diabetes tipe 2 dan kesulitan tidur. Untuk menurunkan berat badan dan meningkatkan kesehatan secara keseluruhan, umumnya dokter akan menyarankan diet yang kaya serat. Apel merupakan salah satu makanan yang kaya serat dengan jumlah kalori yang relatif rendah.\n" +
                    "\n\n4. Meningkatkan Sistem kekebalan tubuh\n" +
                    "Apel merah mengandung antioksidan yang disebut dengan Quercetin. Penelitian terbaru menemukan bahwa Quercetin dapat membantu meningkatkan dan memperkuat sistem kekebalan tubuh, terutama saat kita mengalami Stress.\n" +
                    "\n\n5. Mencegah Katarak\n" +
                    "Katarak merupakan penyakit yang mengaburkan penglihatan dan sangat umum terjadi. Sebuah penelitian jangka panjang menemukan bahwa orang yang menkonsumsi makanan yang kaya antioksidan seperti buah apel akan menurunkan risiko terkena penyakit katarak sekitar 10% hingga 15%.\n" +
                    "\n\n6. Menurunkan risiko terkenanya penyakit Kanker\n" +
                    "Para peneliti yang berasal dari Universitas Cornell mengidentifikasikan beberapa senyawa yang terdapat pada kulit apel (senyawa triterpenoids) dapat menghambat pertumbuhan sel kanker terutama sel kanker hati, usus besar dan payudara.\n" +
                    "\n\n7. Menurunkan risiko Diabetes\n" +
                    "Apel yang merupakan buah yang kaya serat larut dapat mengendalikan gula darah dengan melepaskannya zat gula lebih lambat ke dalam aliran darah. Dengan demikian, lonjakan gula darah yang dikuatirkan oleh penderita Diabetes akan terhindari. Serat larut juga memiliki zat anti-inflamasi yang dapat membantu penderita diabetes pulih lebih cepat dari infeksi.\n" +
                    "\n\n8. Jantung yang lebih Sehat\n" +
                    "Senyawa Fenolik yang terdapat pada kulit buah apel dapat mencegah peningkatan kadar kolesterol dengan memperkuat dinding pembuluh arteri atau pembuluh nadi dan mencegah pembentukan plak (plaque) di dalam arteri. Pembentukan plak dalam arteri inilah yang dapat mengurangi aliran darah ke jantung sehingga menyebabkan penyakit jantung koroner.\n" +
                    "\n\n9. Mencegah Batu Empedu (Gallstones)\n" +
                    "Batu Empedu terbentuk ketika terlalu banyak kolesterol dalam empedu kita. Apel yang kaya dengan serat dapat membantu kita dalam mengendalikan kolesterol dan berat badat yang merupakan penyebab utama terbentuknya batu empedu.\n" +
                    "\n\n10. Membantu sistem pencernaan\n" +
                    "Apel mengandung serat yang dapat membantu melancarkan sistem pencernaan sehingga penyakit seperti sembelit dan diare dapat dicegah. Apel juga mengandung Pektin yang dapat membantu meningkatkan jumlah bakteri baik dalam usus sehingga dapat membantu usus untuk bekerja lebih maksimal.\n",
            "Buah jeruk mengandung vitamin A, B1, B2, dan C, sangat baik baik bagi tubuh karena selain menstimulasi sistem kekebalan tubuh, juga menghilangkan sumbatan lendir di tenggorokan, rongga hidung, paru-paru, dan perut. Berguna pula untuk membersihkan liver dan menghilangkan rasa sakit di tubuh akibat influenza. Campuran sari jeruk nipis dan madu sangat berkhasiat menyembuhkan radang tenggorokan dan amandel, mengandung anti kanker bagi tubuh, dapat mencegah dan mengobati beragam penyakit, dan gangguan kesehatan lain seperti mengobati sariawan dan menurunkan resiko terkena kardiovaskuler, kanker, dan katarak. " +
                    "\n" +
                    "Manfaat Jeruk\n" +
                    "Manfaat Jeruk (sumber: IStockphoto)\n" +
                    "Jeruk terdiri dari berbagai jenis seperti jeruk manis, jeruk nipis, lemon, jeruk bali dan masih banyak lagi. Semuanya memiliki manfaat jeruk yang luar biasa.\n" +
                    "\n" +
                    "Buah jeruk sangat bergizi, menawarkan sejumlah vitamin, mineral, dan senyawa yang membantu Anda tetap sehat. Jeruk adalah sumber serat larut yang baik, yang membantu menurunkan kolesterol dan membantu pencernaan. Jeruk juga rendah kalori, menjadikannya pilihan cerdas bagi orang yang ingin menurunkan atau mempertahankan berat badannya.",
            " Mangga adalah salah satu jenis buah-buahan tropis karena hanya tumbuh di iklim cukup hangat. Buah ini berasal dari Asia Selatan dan telah menyebar hingga Indonesia. Dapat mengurangi dehidrasi dan memperlancar sirkulasi darah karena mengandung vitamin A, E, dan C, bertindak sebagai disinfektan, dapat membersihkan darah, dan mengobati beragam penyakit dan gangguan kesehatan lain seperti bau badan yang tidak sedap, dan menurunkan panas tubuh saat demam. Mangga juga mampu membantu dalam proses pengobatan penyakit kulit seperti bisul, borok, dan lain sebagainya.\n" +
                    "\n" +
                    "Selain rasanya lezat, mangga kaya manfaat bagi kesehatan tubuh. Bahkan buah yang satu ini juga dipercaya mampu mencegah berbagai penyakit berbahaya. Mangga mengandung rendah kalori dan serat tinggi. Mangga merupakan sumber vitamin A, C dan E, serta memiliki kandungan folat, B6, zat besi, hingga kalsium. Buah yang satu ini juga merupakan sumber antioksidan baik, mengandung phytochemical yang baik bagi kesehatan tubuh manusia.\n" +
                    "\n" +
                    "Mangga aman dikonsumsi bagi semua orang, baik anak-anak maupun dewasa. Bahkan banyak pula olahan makanan maupun produk kecantikan yang mencantumkan mangga sebagai salah satu bahan dasarnya.  Selain aromanya khas, mangga dapat memberikan manfaat baik bagi kulit. " +
                    "Manfaat Mangga: Mencegah Berbagai Penyakit\n" +
                    "Mangga memiliki kandungan nutrisi yang cukup banyak. Sehingga buah yang satu ini mampu mencegah berbagai penyakit seperti berikut ini:\n" +
                    "\n" +
                    "1. Menurunkan Kolesterol dan Menjaga Kesehatan Jantung\n" +
                    "\n" +
                    "Mangga memiliki vitamin C dan serat tinggi yang dapat membantu menurunkan kadar kolesterol jahat. Buah tropis ini juga kaya akan kalium yang amat dibutuhkan tubuh. Kalium berfungsi menyeimbangkan sel cairan tubuh guna mengontrol tekanan darah dan detak jantung. Mangga dipercaya mampu menurunkan kolestrol dan meningkatkan kesehatan jantung.\n" +
                    "\n" +
                    "2. Mencegah Kanker\n" +
                    "\n" +
                    "Mangga mengandung pektin, serat makanan yang larut secara efisien menurunkan kadar kolesterol dalam darah. Kandungan ini juga dapat mencegah perkembangan sel kanker prostat.\n" +
                    "\n" +
                    "Berdasarkan hasil penelitian The European Prospective Investigation of Cancel menemukan adanya hubungan kuat antara buah mangga untuk menurunkan risiko kanker, khsusunya pada saluran pencernaan.\n" +
                    "\n" +
                    "3. Mengatasi Obesitas\n" +
                    "\n" +
                    "Manfaat lain mangga adalah mencegah obesitas. Buah ini mengandung serat tinggi yang dapat melancarkan pencernaan dan bisa menurunkan kalori.\n" +
                    "\n" +
                    "Mangga berperan penting untuk menghilangkan masalah gangguan pencernaan seperti susah buang air besar. Penyebabnya, mangga mengandung bahan bioaktif guna meningkatkan fungsi sistem pencernaan.\n" +
                    "\n" +
                    "4. Menyembukan Anemia\n" +
                    "\n" +
                    "Mangga dipercaya dapat menyembuhkan anemia atau kekurangan sel darah. Karena buah mangga memiliki zat besi yang dapat membantu menghilangkan anemia dengan meningkatkan jumlah sel darah merah dalam tubuh.",
            "Pepaya adalah sumber alami vitamin dan mineral penting untuk fungsi normal tubuh.\n" +
                    "\n" +
                    "Seluruh buah, termasuk bagian lain dari pohon, bermanfaat bagi kesehatan dalam beberapa cara.\n" +
                    "\n" +
                    "Pepaya dalam bentuk mentahnya mengandung enzim, yang digunakan dalam persiapan suplemen makanan dan permen karet.\n" +
                    "\nBerikut adalah 13 manfaat buah pepaya bagi kesehatan\n" +
                    "\n1. Penurunan berat badan\n" +
                    "\n" +
                    "Pepaya juga baik untuk orang yang mencoba menurunkan berat badan secara alami mengingat serat, air, vitamin, dan mineral yang dikandungnya.\n" +
                    "\n" +
                    "Memiliki semangkuk pepaya sebagai camilan tengah malam atau pertengahan pagi adalah baik untuk kesehatan.\n" +
                    "\n" +
                    "2. Mencegah Infeksi\n" +
                    "\n" +
                    "Pepaya efektif untuk membunuh cacing usus , sehingga terhindar dari infeksi dan komplikasi yang terkait dengannya.\n" +
                    "\n" +
                    "3. Meredakan sakit gigi\n" +
                    "\n" +
                    "Pasta dari akar pepaya segar dapat digosokkan ke gigi dan gusi sebagai obat rumahan untuk menghilangkan sakit gigi. Kulit pohon, terutama kulit bagian dalam, juga merupakan obat yang sangat baik untuk masalah gigi.\n" +
                    "\n" +
                    "4. Properti Antikanker\n" +
                    "\n" +
                    "Para peneliti telah menemukan bahwa pepaya efektif dalam memerangi kanker payudara, pankreas, dan lainnya.\n" +
                    "\n" +
                    "Ekstrak daun pepaya yang diperoleh dari daun kering menghasilkan efek anti- karsinogenik terhadap sel-sel tumor yang tumbuh di laboratorium.\n" +
                    "\n" +
                    "Diamati dalam penelitian 2010 bahwa efeknya lebih kuat ketika sel-sel diberi dosis yang lebih besar dari teh daun pepaya.\n" +
                    "\n" +
                    "Para ilmuwan mengekspos berbagai jenis sel yang terkena kanker pada ekstrak daun pepaya yang berbeda dan menemukan bahwa pertumbuhan tumor melambat .\n" +
                    "\n" +
                    "Studi lain menunjukkan bahwa likopen yang ditemukan dalam pepaya adalah antioksidan kuat yang membantu meringankan efek radioterapi kanker.\n" +
                    "\n" +
                    "Menurut penelitian dalam jurnal Mutation Research, penggunaan persiapan fermentasi pepaya dapat membantu mengurangi stres oksidatif dan risiko kanker pada penderita diabetes tipe 2.\n" +
                    "\n" +
                    "Buah ini telah mendapatkan kredibilitas dan telah digunakan dalam banyak obat untuk kekuatan antikankernya.\n" +
                    "\n" +
                    "5. Perawatan kulit\n" +
                    "\n" +
                    "Pepaya bisa menjadi besar revitalisasi agen, yang mengapa mereka digunakan dalam banyak kosmetik dan yang bahkan digunakan dalam masker wajah buatan sendiri oleh banyak wanita.\n" +
                    "\n" +
                    "Papain membunuh sel-sel mati dan membersihkan kulit. Sifat-sifat bermanfaat dan enzim penyembuhan hadir dalam pepaya membantu mengobati kulit terbakar dan iritasi.\n" +
                    "\n" +
                    "Hadirnya likopen pada pepaya mengurangi pembentukan keriput pada wanita pasca-menopause, menurut sebuah studi 2014.\n" +
                    "\n" +
                    "6. Baik untuk pijat wajah\n" +
                    "\n" +
                    "Menggunakan pepaya sebagai obat luar biasa untuk mengangkat sel-sel mati.\n" +
                    "\n" +
                    "Jika Anda adalah orang yang menghabiskan sebagian besar waktu di luar rumah, maka pepaya bisa sangat membantu, karena pepaya memerangi radikal bebas yang membuat kulit Anda menua.\n" +
                    "\n" +
                    "Kulit pepaya juga digunakan untuk menggosok wajah dan tangan untuk kulit yang sehat.\n" +
                    "\n" +
                    "Pepaya juga digunakan untuk mengobati gangguan kulit seperti eksim, psoriasis, dan lainnya.\n" +
                    "\n" +
                    "7. Meningkatkan Kesehatan Jantung\n" +
                    "\n" +
                    "Biji pepaya yang baik untuk menjaga jantung Anda sehat.\n" +
                    "\n" +
                    "Memiliki tiga vitamin antioksidan kuat - yaitu vitamin A , C, dan E, berarti pepaya sangat membantu dalam mencegah masalah seperti aterosklerosis dan penyakit jantung diabetes.\n" +
                    "\n" +
                    "Kehadiran fitonutrien pro-karotenoid membantu mencegah oksidasi kolesterol dalam tubuh.\n" +
                    "\n" +
                    "Ketika oksidasi kolesterol terjadi, ia menempel di dinding pembuluh darah dan membentuk plak yang dapat menyebabkan serangan jantung dan stroke.\n" +
                    "\n" +
                    "Vitamin E dan vitamin C yang terkandung dalam pepaya membantu mencegah kolesterol menempel di dinding, sehingga menjaga kesehatan jantung Anda.\n" +
                    "\n" +
                    "Sebagai sumber serat yang baik, pepaya juga membantu mengurangi kadar kolesterol LDL dalam tubuh.\n" +
                    "\n" +
                    "Sertakan pepaya dalam makanan sehari-hari Anda sebagai camilan untuk menjaga hati Anda tetap muda.\n" +
                    "\n" +
                    "8. Mengurangi Jerawat & Luka Bakar\n" +
                    "\n" +
                    "Lateks yang diperoleh dari pepaya digunakan untuk mengobati daerah pada kulit yang terkena jerawat.\n" +
                    "\n" +
                    "Sisi berdaging kulit pepaya dapat digunakan sebagai masker untuk menyembuhkan jerawat.\n" +
                    "\n" +
                    "Diet yang termasuk pepaya akan membantu menyembuhkan kondisi internal, membuat kulit lebih jernih.\n" +
                    "\n" +
                    "Punya luka bakar? Gunakan pepaya.\n" +
                    "\n" +
                    "Ketika lateks dari buah diterapkan pada area yang terbakar, ia membantu mengurangi tanda yang disebabkan oleh luka bakar, membuatnya efektif dalam membantu mengobati luka, luka, dan bisul.\n" +
                    "\n" +
                    "9. Efek Antiinflamasi\n" +
                    "\n" +
                    "Enzim yang ada dalam pepaya, terutama papain dan chymopapain, mengurangi peradangan di berbagai bagian tubuh, menurut penelitian yang dipublikasikan dalam Molecular Nutrition & Food Research.\n" +
                    "\n" +
                    "10. Membantu Mencegah Degenerasi Makula\n" +
                    "\n" +
                    "Degenerasi makula adalah kelainan mata yang berkaitan dengan usia di mana sel-sel mata mengalami degenerasi, menghasilkan penglihatan kabur dan dapat menyebabkan kebutaan.\n" +
                    "\n" +
                    "Antioksidan bernama beta-karoten memberi pepaya warna oranye.\n" +
                    "\n" +
                    "Sama seperti wortel membantu meningkatkan penglihatan karena kehadiran beta-karoten, pepaya juga dikenal efektif dalam mengurangi efek degenerasi makula.\n" +
                    "\n" +
                    "Menurut sebuah penelitian yang diterbitkan dalam Archives of Ophthalmology, konsumsi 3 atau lebih porsi buah ini setiap hari dapat menurunkan risiko degenerasi makula terkait usia (ARMD).\n" +
                    "\n" +
                    "11. Meredakan Sembelit\n" +
                    "\n" +
                    "Kehadiran folat, vitamin C, dan vitamin E dalam pepaya dapat mengurangi mabuk perjalanan dengan menghasilkan efek tonik pada lambung dan usus.\n" +
                    "\n" +
                    "Jus pepaya dan bentuk pepaya yang matang juga membantu pencernaan.\n" +
                    "\n" +
                    "Serat yang diperoleh dari buah membantu meningkatkan pergerakan usus, kata sebuah studi oleh sekelompok peneliti dari Austria.\n" +
                    "\n" +
                    "Gerakan usus yang membaik membantu meringankan buang air besar, sehingga mengurangi efek sembelit.\n" +
                    "\n" +
                    "12. Mengatur Menstruasi\n" +
                    "\n" +
                    "Jus pepaya bisa sangat membantu bagi wanita dengan menstruasi yang tidak teratur.\n" +
                    "\n" +
                    "Konsumsi pepaya hijau yang mentah dapat menormalkan ketidakteraturan dalam siklus periodik seseorang.\n" +
                    "\n" +
                    "Pepaya dianggap sebagai 'makanan panas', artinya mereka menghasilkan panas dalam tubuh.\n" +
                    "\n" +
                    "Produksi panas yang berlebihan dalam tubuh ini diduga merangsang hormon estrogen, yang memicu periode pada wanita.\n" +
                    "\n" +
                    "Oleh karena itu, pepaya dapat bermanfaat dalam menangani menstruasi yang sulit.\n" +
                    "\n" +
                    "13. Mencegah Artritis\n" +
                    "\n" +
                    "Pepaya telah dikenal efektif melawan rheumatoid arthritis dan osteoarthritis.\n" +
                    "\n" +
                    "Selain sifat anti-inflamasi yang dibahas di atas, salah satu enzim yang ditemukan dalam pepaya, yang disebut chymopapain, memiliki efek signifikan pada pengendalian rheumatoid arthritis dan osteoarthritis.",
            "Manfaat Pisang untuk Kesehatan\n" +
                    "Nah, berikut 20 khasiat pisang yang perlu Anda ketahui untuk memaksimalkan manfaat pisang.\n" +
                    "\n" +
                    "1. Sumber energi\n" +
                    "Buah pisang dengan mudah dapat dicerna, gula yang terdapat di dalam pisang diubah menjadi sumber tenaga secara cepat, dan itu bagus dalam pembentukan tubuh, untuk kerja otot, dan sangat bagus untuk menghilangkan rasa lelah.\n" +
                    "\n" +
                    "2. Baik ibu hamil\n" +
                    "Pisang juga disarankan untuk dikonsumsi para wanita hamil karena mengandung asam folat, yang mudah diserap janin melalui rahim. Namun, jangan terlalu berlebihan, sebab satu buah pisang mengandung sekitar 85-100 kalori.\n" +
                    "\n" +
                    "3. Mengatasi anemia\n" +
                    "Sebanyak dua buah pisang yang dimakan oleh pasien anemia setiap hari sudah cukup, karena mengandung Fe (zat besi) tinggi.\n" +
                    "\n" +
                    "4. Mengatasi penyakit usus dan perut\n" +
                    "Pisang yang dicampur susu cair (atau dimasukkan dalam segelas susu cair) dapat dihidangkan sebagai obat dalam kasus penyakit usus. Juga dapat direkomendasikan untuk pasien sakit perut dan cholik untuk menetralkan keasaman lambung.\n" +
                    "\n" +
                    "Sebuah pisang dihidangkan sebagai pertahanan terhadap inflamasi karena Vitamin C dapat secara cepat diproses. Ia mentransformasikan bacillus berbahaya menjadi bacillus yang bersahabat. Dengan demikian, keduanya akan tertolong.\n" +
                    "\n" +
                    "Pisang utuh ataupun krim pisang (seperti untuk makanan bayi), dapat dikonsumsi oleh pasien yang menderita diare.\n" +
                    "\n" +
                    "5. Manfaat bagi penderita lever\n" +
                    "Khasiat pisang baik untuk penderita penyakit lever, baiknya mengonsumsi pisang dua buah ditambah satu sendok madu, akan menambah nafsu makan dan memperkuat tubuh.\n" +
                    "\n" +
                    "6. Menyembuhkan luka bakar\n" +
                    "Daun pisang dapat digunakan untuk pengobatan kulit yang terbakar dengan cara dioles, campuran abu daun pisang ditambah minyak kelapa mempunyai pengaruh mendinginkan kulit.\n" +
                    "\n" +
                    "7. Manfaat bagi diabetes\n" +
                    "Bagi masyarakat Gorontalo (Sulawesi Utara), jenis pisang goroho yakni pisang khas daerah setempat, merupakan makanan tambahan atau makanan pokok bagi orang yang menderita penyakit gula atau diabetes melitus, terutama buah pisang goroho yang belum matang, kemudian dikukus dan dicampur dengan kelapa parut muda.\n" +
                    "\n" +
                    "8. Mempercantik kulit\n" +
                    "Bubur pisang dicampur dengan sedikit susu dan madu, dioleskan pada wajah setiap hari secara teratur selama 30-40 menit. Basuh dengan air hangat kemudian bilas dengan air dingin atau es, diulang selama 15 hari, akan menghasilkan pengaruh yang menakjubkan pada kulit." +
                    "9. Mengontrol berat badan\n" +
                    "Pisang juga mempunyai peranan dalam penurunan berat badan seperti juga untuk menaikkan berat badan. Telah terbukti pada seseorang kehilangan berat badan dengan melakukan diet empat buah pisang dan empat gelas susu non-lemak atau susu cair per hari sedikitnya tiga hari dalam seminggu, jumlah kalori hanya 1250 dan menu tersebut cukup menyehatkan.\n" +
                    "\n" +
                    "Selain itu, diet tersebut membuat kulit wajah tidak berminyak dan bersih. Pada sisi yang lain, mengonsumsi satu gelas banana milk-shake dicampur madu, buah-buahan, kacang, dan mangga sesudah makan, akan menaikkan berat badan.\n" +
                    "\n" +
                    "10. Mengatasi depresi\n" +
                    "Mafaat pisang membantu mengatasi depresi karena kadar tryptophan yang tinggi, diubah menjadi serotonin – neurotransmitter otak suasana bahagia.\n" +
                    "\n" +
                    "11. Mencegah kram otot\n" +
                    "Lindungi diri dari kram otot selama latihan dan kram kaki di malam hari dengan makan pisang.\n" +
                    "\n" +
                    "12. Memperkuat tulang\n" +
                    "Hitung kehilangan kalsium saat buang air kecil dan membangun tulang yang kuat dengan suplementasi dengan pisang.\n" +
                    "\n" +
                    "13. Mengatasi mood\n" +
                    "Tingkatkan suasana hati Anda dan kurangi gejala PMS dengan makan pisang, yang mengatur gula darah dan menghasilkan relaksasi penghilang stres.\n" +
                    "\n" +
                    "14. Menurunkan hipertensi\n" +
                    "Tinggi kalium dan rendah garam, pisang secara resmi diakui oleh FDA mampu menurunkan tekanan darah dan melindungi terhadap serangan jantung dan stroke.\n" +
                    "\n" +
                    "Manfaat pisang untuk pencernaan:\n" +
                    "15. Membuang racun\n" +
                    "Kaya akan pektin, pisang membantu pencernaan dan dengan lembut mengelupas racun dan logam berat dari tubuh.\n" +
                    "\n" +
                    "16. Prebiotik\n" +
                    "Pisang bertindak sebagai prebiotik, merangsang pertumbuhan bakteri ramah di usus. Mereka juga memproduksi enzim pencernaan untuk membantu menyerap nutrisi.",
            "Buah stroberi mengandung provitamin A, vitamin B, vitamin B1, vitamin C, folat, potassium serta asam ellagic. Buah stroberi memiliki kandungan antioksidan yang dapat melawan radikal bebas, dan menyimpan nutrisi yang luar biasa serta rendah kalori.\n" +
                    "\n" +
                    "Buah stroberi mampu mengurangi kadar kolesterol, membantu mengobati kanker, dan mengurangi gejala stroke. Buah stroberi juga mampu mengobati gangguan pada kandung kemih. Biasanya buah stroberi digunakan menjadi anti virus." +
                    "Berbagai manfaat buah stroberi untuk kesehatan tubuh\n" +
                    "\n1. Menjaga kesehatan mata\n" +
                    "Penglihatan mata bisa semakin memburuk seiring bertambahnya usia. Masalah yang dapat muncul antara lain mata kering, degenerasi saraf optik, degenerasi makula, gangguan lapang pandang, dan meningkatnya risiko infeksi mata." +
                    "\n\n2. Meningkatkan kekebalan tubuh\n" +
                    "Sistem imun merupakan garis pertahanan pertama sebagai pelindung tubuh dari berbagai infeksi virus, bakteri, dan berbagai potensi berbahaya lain. Vitamin C yang terkandung di dalam stroberi meningkatkan sistem kekebalan tubuh sehingga Anda tidak mudah sakit. Vitamin C juga memiliki antioksidan, yang membantu menetralisir radikal bebas yang dapat membahayakan tubuh.\n" +
                    "\n" +
                    "3. Mengobati nyeri sendi dan asam urat\n" +
                    "Berbagai masalah nyeri pada persendian serta asam urat merupakan salah satu efek buruk yang ditimbulkan dari radikal bebas. Stroberi dapat membantu mengobati permasalahan ini dengan kandungan antioksidan yang dimilikinya. Dikatakan bahwa mengonsumsi buah stroberi setiap hari dapat meredakan peradangan sendi.\n" +
                    "\n" +
                    "4. Mencegah kanker\n" +
                    "Vitamin C, asam folat, anthocyanins, quercetin, dan kaempferol merupakan beberapa jenis flavonoid yang terkandung dalam stroberi yang memilki efek antikarsinogenik. Oleh karena itu, kandungan antioksidan ini dipercaya dapat melawan pertumbuhan tumor penyebab kanker. Konsumsi stroberi setiap hari memiliki manfaat besar terhadap penurunan kemungkinan metastasis (penyebaran) sel kanker yang berbahaya.\n" +
                    "\n" +
                    "5. Meningkatkan fungsi otak\n" +
                    "Memasuki usia lanjut, daya ingat dan kemampuan kognitif otak dapat mengalami penurunan. Radikal bebas merupakan agen yang bertangggung jawab terhadap terjadinya penuaan tersebut. Paparan radikal bebas yang diterima tubuh menyebabkan jaringan otak mulai mengalami penurunan fungsi dan saraf otak melemah.\n" +
                    "\n" +
                    "Untungnya, buah stroberi dapat membantu mencegah terjadinya kondisi tersebut. Peneliti dari Harvard University melakukan penelitian di Brigham and Women’s Hospital melihat bahwa peningkatan konsumsi anthocyanidin dan flavonoid yang terdapat pada stroberi dan buah beri lainnya dapat melawan penurunan daya ingat.\n" +
                    "\n" +
                    "6. Mencegah tekanan darah tinggi dan serangan jantung\n" +
                    "Salah satu penelitian yang dipublikasikan pada American Journal of Clinical Nutrition menemukan bahwa konsumsi makanan yang kaya akan anthocyanin seperti stroberi dapat mencegah tekanan darah tinggi. Efek ini terutama terlihat paling signifikan pada mereka yang berusia 60 tahun ke bawah. Anthocyanin adalah salah satu antioksidan yang kuat yang dapat melawan radikal bebas. Diduga pada mereka yang berusia 60 tahun ke atas, kerusakan pada pembuluh darah sudah terlalu parah sehingga anthocyanin tidak dapat menunjukkan manfaatnya.",
            "Buah nanas kaya akan vitamin C dan mangan, serta mengandung vitamin A, vitamin B1, vitamin B6, tembaga, serat pangan, folat, dan asam pantotenik. Buah nanas juga mengandung enzim proteolitik bromelain yang berperan membantu memecah protein.\n" +
                    "\n" +
                    "Buah nanas bermanfaat untuk mencegah kanker, membantu sistem pencernaan, mambantu menurunkan berat badan, memperkuat daya tahan tubuh, meredakan peradangan, membantu penyembuhan sinusitis, memperkuat kinerja mata, dan sebagai antioksidan dari radikal bebas.\n" +
                    "Manfaat buah nanas untuk pencernaan\n" +
                    "1. Mengandung enzim baik untuk pencernaan\n" +
                    "Menurut Medical Center di Maryland Universiy, buah nanas juga memiliki enzim pencernaan baik, yang disebut bromelain. Enzim ini merupakan campuran dari enzim proteolitik yang membantu usus Anda memecah dan menyerap protein lebih banyak. Manfaat lain dari bromelain ini juga mampu meringankan masalah perut seperti, sakit perut dan diare.\n" +
                    "\n" +
                    "2. Melancarkan sistem pencernaan\n" +
                    "Buah nanas secara alami memiliki kandungan yag kaya serat. Fungsi kaya serat ini, baik untuk meningkatkan sistem pencernaan. Biasanya, makanan yang tinggi serat agak susah larut dicerna, tapi tidak dengan buah nanas.\n" +
                    "\n" +
                    "Manfaat buah nanas untuk pencernaan ini tidak sampai situ saja, nanas memiliki sejumlah kandungan vitamin dan mineral yang mampu menyerap air pada usus Anda. Untuk sistem penceranaan yang normal , Anda perlu mengonsumsi 14 gram total serat dari 1000 kalori perharinya, dan itu bisa Anda dapatkan pada buah nanas. Menurut Colorado State University Extension, makan buah nanas setengah potong mengandung 2,2 gram total serat makanan.\n" +
                    "\n" +
                    "3. Buah nanas menangkal sakit akibat perut kembung\n" +
                    "Biasanya, kembung ditandai dengan perut yang membesar dan ada tekanan gas yang lebih kuat. Anda tidak perlu pusing mengobatinya. Cukup dengan makan buah nanas makanan lain yang menyebabkan refluks atau gas pada pencernaan muncul, bisa diredakan secara alami.  Kembali lagi dengan kandungan bromelain dan fiber dari buah nanas yang bermanfaat untuk sistem pencernaan, bromelain memiliki sifat yang menenangkan pada perut Anda.\n" +
                    "\n" +
                    "4. Mencegah kanker usus\n" +
                    "Makan buah nanas untuk pencernaan juga bagus untuk mencegah kanker pada usus. Kandungan antioksidan dari vitamin C mampu melawan sel-sel kanker di dalam tubuh. Selain itu buah nanas juga kaya kandungan antioksidan lainnya, termasuk vitamin A, beta karoten, bromelain, dan berbagai senyawa flavonoid. Buah nanas juga mampu menangkal radikal bebas yang kuat akan penyebab pertumbuhan kankernya.\n" +
                    "\n" +
                    "Efek samping kebanyakan makan buah nanas\n" +
                    "Selain buah nanas baik untuk pencernaan, tapi tidak baik juga kalau mengonsumsinya berlebihan. Anda mungkin akan merasakan bengkak dan agak gatal di bagian, bibir, lidah, dan pipi bagian dalam. Hal ini disebabkan oleh sifat daging nanas itu sendiri yang panas, biasanya akan hilang dalam beberapa jam. Tapi kalau disertai gatal-gatal sampai sulit bernapas, bisa jadi Anda memang alergi buah nanas.\n" +
                    "\n" +
                    "Sedangkan untuk wanita hamil, asupan kandungan bromelain yang berlebihan akan mengakibatkan kontraksi rahim yang berpotensi menimbulkan keguguran. Tentu saja bukan berarti ibu hamil tidak boleh makan nanas. Bromelain dalam level membahayakan ini baru bisa didapat jika Anda melahap dua buah nanas utuh sekaligus.",
            "Buah alpukat mengandung lemak sehat oleat (omega-9), vitamin A, vitamin B, vitamin B6, vitamin C, vitamin E, zat besi, tembaga, kalium, serat, dan asam solfat. Buah alpukat kaya akan manfaat dan dapat melindungi tubuh dari berbagai penyakit.\n" +
                    "\n" +
                    "Buah alpukat bermanfaat untuk kesehatan jantung, mengontrol tekanan darah, menurunkan kadar kolesterol, mengatur kadar gula darah, mengurangi resiko stroke, mencegah kanker, menambah berat badan dan juga bagus untuk kesehatan mata.\n" +
                    "manfaat kamu makan buah alpukat.\n" +
                    "\n" +
                    "1. Menurunkan Kolesterol\n" +
                    "\n" +
                    "Alpukat sangat bergizi dan mengandung berbagai macam nutrisi, termasuk 20 vitamin dan mineral. Buah itu juga dapat menurunkan kolesterol atau natrium apa pun dan rendah lemak jenuh. Itulah sebabnya mengapa alpukat termasuk buah yang disukai.\n" +
                    "\n" +
                    "2. Mengandung Lebih Banyak Kalium dari Pisang\n" +
                    "\n" +
                    "Kebanyakan orang kurang mendapat nutrisi berupa kalium. Alpukat mengandung kalium yang sangat tinggi.\n" +
                    "\n" +
                    "Kandungan kalium pada alpukat 14 persen. Nilai ini lebih tinggi dari pisang yang hanya 10 persen kalium. Beberapa penelitian menunjukkan bahwa memiliki asupan kalium yang tinggi dikaitkan dengan penurunan tekanan darah, yang merupakan faktor risiko utama untuk serangan jantung, stroke, dan gagal ginjal.\n" +
                    "\n" +
                    "3. Mengatasi Kanker\n" +
                    "\n" +
                    "Alpukat tidak mengandung lemak apa pun. Mayoritas lemak dalam alpukat adalah asam oleat. Asam oleat merupakan asam lemak tak jenuh tunggal yang juga merupakan komponen utama minyak zaitun dan diyakini bertanggung jawab atas beberapa manfaat kesehatannya. Asam oleat telah dikaitkan dengan pengurangan peradangan dan terbukti memiliki efek menguntungkan pada gen yang terkait dengan kanker.\n" +
                    "\n" +
                    "\n" +
                    "4. Banyak Serat\n" +
                    "\n" +
                    "Serat adalah nutrisi lain yang relatif kaya pada alpukat. Serat dapat berkontribusi pada penurunan berat badan, mengurangi lonjakan gula darah, dan sangat terkait dengan risiko rendah dari banyak penyakit.\n" +
                    "\n" +
                    "\n" +
                    "5. Menyerap Nutrisi\n" +
                    "\n" +
                    "\n" +
                    "Satu studi menunjukkan bahwa menambahkan alpukat atau minyak alpukat ke salad dapat meningkatkan penyerapan antioksidan 2,6 hingga 15 kali lipat. Jadi, alpukat dapat meningkatkan nilai gizi makanan nabati lain yang kamu makan. Hal ini dapat kamu jadikan alasan memasukkan sumber lemak sehat saat makan sayuran.\n" +
                    "6. Melindungi Mata\n" +
                    "\n" +
                    "Studi menunjukkan bahwa mereka yang terkait dengan risiko katarak dapat berkurang secara drastis karena makan alpukat. Karena itu, makan alpukat bermanfaat bagi kesehatan mata kamu dalam jangka panjang.\n" +
                    "\n" +
                    "7. Menurunkan Stres\n" +
                    "\n" +
                    "Manfaat alpukat dapat membantu mencegah kelebihan kadar homosistein dalam tubuh. Terlalu banyak homosistein bisa membuat kamu mudah terkena stres.\n" +
                    "\n" +
                    "\n" +
                    "8. Dapat Membantu Menurunkan Berat Badan\n" +
                    "\n" +
                    "Ada beberapa bukti bahwa alpukat adalah makanan yang dapat menurunkan berat badan. Dalam sebuah penelitian, orang yang makan alpukat akan merasa 23% lebih kenyang dan memiliki keinginan 28% lebih rendah untuk makan 5 jam berikutnya, dibandingkan dengan orang yang tidak mengkonsumsi buah ini.",
            "Buah anggur mengandung vitamin A, vitamin B komplek, vitamin C, vitamin K, asam galat, glukosida, mangan, zat besi, dan kalsium. Buah anggur terdapat senyawa lain seperti zat polifenol dan resveratol yang dikenal sebagai antioksidan.\n" +
                    "\n" +
                    "Buah anggur bermanfaat untuk mengurangi resiko terkena kanker payudara, prostat, dan usus besar. Selain itu buah anggur juga dapat menurunkan resiko stroke, mengontrol gula darah, menyehatkan ginjal dan pencernaan. Kandungan lain buah anggur juga dimanfaatkan untuk antioksidan dan anti mikroba.\n" +
                    "Beragam Manfaat Buah Anggur untuk Kesehatan\n" +
                    "Ada beberapa manfaat buah anggur yang bisa Anda rasakan, di antaranya:\n" +
                    "\n" +
                    "Mengatasi gangguan pembuluh darah dan jantung\n" +
                    "Kanfungan polifenol di dalam buah anggur diyakini mampu membantu mencegah gangguan jantung, melawan radikal bebas, memiliki efek antiradang dan antiplatelet sehingga mampu menurunkan risiko terjadinya tekanan darah tinggi dan aterosklerosis, serta menunjang fungsi endotel.\n" +
                    "Mencegah penyakit kanker\n" +
                    "Kulit dan ekstrak biji buah anggur mengandung bahan alami yang mampu membantu memperlambat atau mencegah berbagai jenis kanker, termasuk mulut, esofagus, faring, paru-paru, endometrium, usus besar, pankreas, dan prostat.\n" +
                    "Mengurangi gejala insufisiensi vena kronis\n" +
                    "Selain mencegah kanker, ekstrak biji buah anggur juga bisa membantu mengurangi gejala insufisiensi vena kronis, seperti kaki terasa berat, lelah, tegang, nyeri dan kesemutan. Menurut penelitian, ekstrak daun anggur tertentu mampu mengurangi kaki bengkak setelah 6 minggu.\n" +
                    "Menurunkan tekanan darah tinggi\n" +
                    "Menurut penelitian, kandungan antioksidan yang tinggi di dalam buah anggur bisa membantu menurunkan tekanan darah tinggi. Selain itu, buah anggur juga tinggi akan kandungan kalium yang membantu menghilangkan efek natrium dalam tubuh, sehingga tekanan darah tinggi bisa dikurangi.\n" +
                    "Meningkatkan daya ingat\n" +
                    "Penelitian menunjukkan bahwa buah-buahan yang kaya akan antioksidan bisa membantu mengurangi stres oksidatif sehingga memperlambat penuaan, meningkatkan kinerja memori verbal dan fungsi motorik, serta mengatasi gangguan saraf otak, misalnya pada penyakit Alzheimer.\n" +
                    "Mengurangi risiko diabetes\n" +
                    "Sebuah penelitian menunjukkan, konsumsi tiga porsi anggur, blueberry kismis, apel, atau pir per minggu, dapat mengurangi risiko diabetes tipe 2. Anggur termasuk buah yang tinggi kandungan antioksidan, hingga diyakini baik untuk dikonsumsi oleh penderita diabetes.\n" +
                    "Melindungi retina mata\n" +
                    "Menurut penelitian, buah anggur yang dikonsumsi secara teratur bisa membantu mencegah terjadinya gangguan pada retina mata, misalnya degenerasi makula. Mengonsumsi ekstrak biji anggur juga dapat membantu mengurangi stres pada mata akibat melihat sinar yang terlalu terang.\n" +
                    "Memperlambat penuaan\n" +
                    "Buah anggur juga mengandung resveratrol yang bisa membantu mencegah penyakit degeneratif, mengaktifkan gen panjang usia dan membantu sel hidup lebih lama. Selain itu, anggur juga mengandung lemak tak jenuh ganda, seperti asam lemak esensial linolenat yang berfungsi untuk mengurangi peradangan dan meningkatkan sensitivitas kulit.",
            "Buah kiwi kaya akan vitamin c, serta ada juga vitamin A, vitamin B kompleks, vitamin E, vitamin K, serat pangan yang baik, beta-karoten, lutein, zeaxanthin, folat, riboflavin, niacin, dan tiamin.\n" +
                    "\n" +
                    "Buah kiwi bermanfaat untuk meningkatkan daya tahan tubuh, mencegah penggumpalan darah, mengurangi resiko stroke, mengatasi hipertensi, mencegah serangan jantung, membantu penyerapan zat besi, membantu proses pencernaan, menurunkan resiko diabetes, menjaga kesehatan kulit, dan juga sebagai sumber antioksidan.\n" +
                    "Berikut adalah 7 manfaat baik yang bisa kamu dapat dari buah kiwi!\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "1. Sangat kaya akan vitamin C\n" +
                    "Bila kamu pikir buah lemon dan jeruk kaya akan vitamin C, kiwi mengalahkan kedua buah tersebut! Setiap 100 gram mengandung 158% vitamin C - dua kali lebih banyak dibanding buah lemon atau jeruk. Antioksidan di dalam vitamin C dapat menyingkirkan radikal bebas yang mengakibatkan inflamasi atau kanker. Ditambah lagi, vitamin C dapat menaikkan kekebalan tubuh agar kamu tidak mudah jatuh sakit. \n" +
                    "2. Membantu tidur nyenyak\n" +
                    "Menurut riset dari Taipei Medical University, berbagai studi telah mengungkapkan bahwa kiwi memiliki banyak kandungan baik seperti antioksidan dan serotonin yang berguna untuk orang yang sulit tidur. Katanya, mengkonsumsi dua buah kiwi satu jam sebelum tidur dapat memulihkan insomnia dan membantu kamu tidur dengan cepat! Try it and see.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "3. Sumber serat yang baik\n" +
                    "Buah eksotis ini kaya akan serat yang membantu mencegah berbagai macam penyakit. Selain membuat perut lebih kenyang, makanan kaya serat juga membantu tubuhmu menjaga tekanan darah, kolestrol, dan kadar gula, lho. Bahkan menurut sebuah studi dari University of Leeds, mengkonsumsi makanan kaya serat dapat menurunkan risiko penyakit jantung dan aman untuk penderita diabetes.\n" +
                    "4. Melancarkan saluran pencernaan\n" +
                    "Mirip seperti buah pepaya, kiwi mengandung enzim bernama actinidain yang melancarkan pencernaan protein. Bila kamu mengalami konstipasi atau kesulitan membuang air besar, have a kiwi or two!\n" +
                    "5. Mempercantik kulit\n" +
                    "Tubuh dan kulit yang sehat membutuhkan tingkat pH yang stabil. Nah, sifat alkaline dalam kiwi dapat menetralisir tubuh jika kamu terlalu sering mengkonsumsi makanan yang bersifat asam. Antioksidan dalam vitamin C dan E dalam kiwi juga baik untuk kulit dan menjaganya agar awet muda! Last but not least, kiwi mengandung omega 3, carotenoid, polyphenol, dan mendukung kesehatan jantung.\n" +
                    "\n" +
                    "\n" +
                    "\n" +
                    "6. Bermanfaat untuk wanita hamil\n" +
                    "Yes, kiwi sangat baik untuk kesehatan wanita hamil berkat kandungan folat. Folat dapat menyehatkan dan membantu pertumbuhan kandungan! Selain itu, kiwi juga baik untuk pertumbuhan anak-anak!\n" +
                    "7. Gudang vitamin dan mineral\n" +
                    "Kiwi kaya akan berbagai macam vitamin dan mineral seperti vitamin A, B6, B12, E, potasium, kalsium, zat besi dan magnesium. Vitamin dan mineral tersebut dapat melancarkan peredaran darah, mengurangi stres, menyehatkan tulang dan gigi, dan mendukung kesehatan mata. Kandungan potasium yang tinggi juga menstabilkan tekanan darah, sedangkan magnesium membantu otot dan saraf agar bekerja dengan normal.",
            "Buah naga juga banyak mengandung kandungan air di dalamnya. Kandungan buah naga antara lain, vitamin C, vitamin B kompleks, kalori, protein, karbohidrat, serat, kalsium, fosfor, zat besi, serta air.\n" +
                    "\n" +
                    "Buah naga bermanfaat untuk mengontrol kadar gula dalam darah, menurunkan tekanan darah, menetralkan racun dalam tubuh, menjaga kesehatan mata, mengobati asma, dan juga sebagai antioksidan.\n" +
                    "Manfaat Buah Naga Merah Untuk Kesehatan\n" +
                    "Manfaat yang dihasilkan dari mengonsumsi buah naga merah sangatlah beragam. Dimulai dari manfaat yang dapat dirasakan langsung oleh tubuh sampai pada manfaat yang tidak dirasakan secara langsung, alias jangka panjang.\n" +
                    "\n" +
                    "Beberapa bagian dalam buah naga merah memiliki khasiat serta manfaat yang berbeda-beda. Dimulai dari bagian batang, daging, serta kulitnya terkandung vitamin serta zat yang kaya akan manfaat. Pada kesempatan kali ini pembahasan terfokus pada manfaat buah naga merah yaitu sebagai berikut:\n" +
                    "\n" +
                    "1. Membantu Menjaga Kesehatan dan Stamina Tubuh\n" +
                    "Kandungan antioksidan serta vitamin yang terdapat dalam buah naga merah dapat memberikan manfaat dalam menjaga kesehatan serta stamina tubuh. Hal ini penting guna meminimalisir efek radikal bebas serta lebih tahan terhadap penyakit.\n" +
                    "\n" +
                    "2. Membantu Menurunkan Kadar Kolesterol dalam Tubuh\n" +
                    "Kandungan vitamin B3 dalam buah naga merah sangat baik untuk membantu menurunkan kadar kolesterol dalam tubuh. Sangat disarankan bagi yang memiliki kadar kolesterol tinggi untuk mengonsumsi buah ini. Seperti kita ketahui bahwa kolesterol sangat berbahaya apabila dibirkan tinggi, penyakit-penyakit serius yang timbulkannya antara lain penyakit jantung koroner dan stroke.\n" +
                    "\n" +
                    "Iklan dari HonestDocs\n" +
                    "Beli Simvastatin via HonestDocs!\n" +
                    "Simvastatin berfungsi untuk menurunkan kadar kolesterol yang tinggi pada pasien – pasien dislipidemia. Dapatkan GRATIS ongkir* ke seluruh wilayah Indonesia!\n" +
                    "\n" +
                    "Pesan Sekarang\n" +
                    "3. Membantu Meredakan Batuk\n" +
                    "Manfaat buah naga merah selanjutnya yaitu dapat membantu meredakan penyakit batuk. Lagi-lagi khasiat ini diperantarai oleh kandungan vitamin B3 di dalamnya.\n" +
                    "\n" +
                    "4. Membantu dalam Penyembuhan Penyakit Kanker\n" +
                    "Para dokter telah merekomendasikan untuk mengonsumsi buah naga merah dalam rangka membantu penyembuhan penyakit kanker. Kandungan vitamin kompleksnya sangat bermanfaat bagi proses terapi dalam penyembuhan penyakit tersebut.\n" +
                    "\n" +
                    "5. Meredakan Penyakit Asma\n" +
                    "Bagi seseorang yang menderita penyakit asma sangat dianjurkan untuk mengonsumsi buah naga merah. Hal tersebut dikarenakan kandungan vitamin B3 di dalamnya yang mampu membantu meredakan penyakit asma.\n" +
                    "\n" +
                    "6. Menstabilkan tekanan Darah Tinggi\n" +
                    "Buah naga merah dengan kandungan vitamin B3-nya sangat baik untuk dikonsumsi bagi penderita darah tinggi. Dokter pun menganjurkan untuk banyak mengonsumsi buah ini bagi penderita penyakit tersebut.\n" +
                    "\n" +
                    "7. Mencegah Osteoporosis\n" +
                    "Mengonsumsi buah naga merah sangat baik untuk mencegah penyakit pengeroposan pada tulang atau yang biasa dikenal dengan sebutan istilah osteoporosis. Hal tersebut dikarenakan di dalam buah tersebut terdapat kandungan kalsium organik yang sangat baik untuk tulang.\n" +
                    "\n" +
                    "8. Membantu Penyembuhan Penyakit Diabetes\n" +
                    "Rasa manis yang ada pada buah naga merah tidak berasal dari glukosa sehingga aman untuk penderita penyakit diabetes. Bahkan beberapa ahli juga menyebutkan bahwa manfaat buah naga merah juga dapat membantu penyembuhan pada penderita penyakit tersebut.",
            "Buah semangka banyak mengandung air. Buah semangka juga mengandung vitamin A, vitamin C, kalori, lemak, natrium, karbohidrat, serat, asam amino sitrulin, asam spantotenik, tembaga, biotin, potasium, dan magnesium.\n" +
                    "\n" +
                    "Buah semangka bermanfaat untuk menjaga tubuh tetap terhidrasi, melancarkan sistem pencernaan, menurunkan resiko kanker, mengurangi resiko serangan jantung, menurunkan tekanan darah tinggi, menjaga kesehatan ginjal, dan meningkatkan kesehatan tulang.\n" +
                    "Semangka memiliki rasa manis dan menyegarkan saat disantap ketika cuaca panas. Selain itu, dengan kandungan yang dimilikinya, semangka juga memiliki manfaat yang bisa dirasakan oleh tubuh. Berikut ini berbagai manfaat semangka untuk tubuh:\n" +
                    "1. Mencegah Impoten\n" +
                    "\n" +
                    "Manfaat buah semangka secara alami dapat dirasakan untuk pria. Semangka dapat digunakan untuk obat kuat pria yang dapat menjaga kesuburan. Dengan mengonsumsi semangka, maka dapat mengobati dan mencegah impoten. Impoten adalah kondisi ketika penis tidak mampu ereksi atau mempertahankan ereksi walaupun adanya rangsangan seksual.\n" +
                    "\n" +
                    "2. Mengatasi Lemak yang Menumpuk\n" +
                    "\n" +
                    "Kandungan asam amino citruline yang dimiliki semangka dapat secara efektif mengatasi lemak yang menumpuk dalam tubuh. Semangka mampu melemahkan sel-sel lemak dalam tubuh dan melarutkannya dalam saluran pencernaan. Dengan manfaatnya ini, maka semangka dapat kamu gunakan jika sedang menjalani diet.\n" +
                    "\n" +
                    "3. Menyehatkan Jantung\n" +
                    "\n" +
                    "Semangka sangat kaya likopen yang dapat melindungi tubuh dari kolesterol jahat. Hal ini yang membuat semangka dapat membantu menjaga kesehatan jantung.\n" +
                    "\n" +
                    "4. Membantu Mencukupi Kebutuhan Gizi Harian\n" +
                    "\n" +
                    "Semangka merah termasuk buah yang rendah kalori. Ada banyak kandungan gizi yang dimiliki semangka. Kandungan yang dimilikinya sangat bagus untuk memenuhi kebutuhan gizi yang dibutuhkan tubuh.\n" +
                    "\n" +
                    "5. Menurunkan Tekanan Darah\n" +
                    "\n" +
                    "Manfaat semangka selanjutnya yaitu dapat membantu menurunkan tekanan darah. Buah ini memiliki efek yang sangat baik mengatasi tekanan yang terlalu berat pada pembuluh darah. Hal ini yang membuat semangka sangat bermanfaat untuk mencegah hipertensi.\n" +
                    "\n" +
                    "6. Mencegah Dehidrasi\n" +
                    "\n" +
                    "Semangka memiliki 92% kandungan air di dalamya. Kandungan air yang tinggi ini dapat membantu mencegah dehidrasi.\n" +
                    "\n" +
                    "7. Menjaga Kelembapan Kulit\n" +
                    "\n" +
                    "Kandungan tinggi air yang dimiliki semangka ini juga dapat memberikan kelembapan pada kulit. Jika kamu memiliki masalah kulit kering, kamu dapat mengonsumsi semangka untuk membantu mengobatinya. Kulit yang kering dapat disebabkan oleh kurangnya kandungan air di dalam tubuh. Selain dikonsumsi secara langsung, kamu juga bisa menggunakan semangka sebagai masker untuk wajah.\n" +
                    "\n" +
                    "8. Melindungi Fungsi Saraf\n" +
                    "\n" +
                    "Manfaat semangka selanjutnya juga dapat membantu melindungi fungsi saraf. Semangka memiliki kandungan kalium yang dapat membantu mengatur fungsi saraf.\n" +
                    "\n" +
                    "9. Mengatasi Sembelit\n" +
                    "\n" +
                    "Sembelit atau sulit buang air besar disebabkan oleh berbagai hal salah satunya kurangnya serat di dalam tubuh. Buah semangka yang tinggi kandungan air, dapat menjadi solusi untuk mengatasi kondisi ini.\n" +
                    "\n" +
                    "10. Menjaga Kesehatan Ginjal\n" +
                    "\n" +
                    "Kandungan potasiun di dalam semangka dapat membantu membersihkan endapan beracun di ginjal. Semangka juga bermanfaat untuk mengurangi konsentrasi asam urat sehingga dapat membantu mengurangi kerusakan ginjal dan pembentukan batu ginjal. Kandungan airnya yang tinggi juga mampu mendorong untuk buang air kecil yang dapat membantu membersihkan ginjal.\n" +
                    "11. Menjaga Kesehatan Rambut\n" +
                    "\n" +
                    "Semangka juga baik untuk menjaga kesehatan rambut. Vitamin A yang terdapat di dalamnya dapat membantu batang rambut tetap lembap.\n" +
                    "\n" +
                    "12. Mengatasi Nyeri Otot\n" +
                    "\n" +
                    "Senyawa asam amino citruline yang terdapat dalam semangka dapat membantu meredakan nyeri otot. Senyawa ini membuat otot menjadi lebih santai dan meredakan ketegangan. Banyak orang yang mengonsumsi semangka setelah melakukan pertandingan.\n" +
                    "\n" +
                    "13. Mencegah Kanker\n" +
                    "\n" +
                    "Kandungan vitamin C dan likopen yang tinggi pada semangka sangat berperan penting dalam melindungi tubuh dari radikal bebas. Radikal bebas merupakan salah satu yang menyebabkan penyakit kanker. Selain itu, semangka juga memiliki senyawa antioksidan yang berperan pula untuk mencegah pertumbuhan sel-sel kanker berkembang.",
            "Buah tomat mengandung vitamin A, vitamin B1, dan vitamin C. manfaat buah tomat yaitu salah satunya dapat membantu membersihkan darah dan hati kita. Selain itu buah tomat juga bagus untuk kesehatan kulit kita.\n" +
                    "\n" +
                    "Buah tomat juga dapat mencegah berbagai penyakit dan gangguan kesehatan seperti gusi berdarah, rabun senja, penggumpalan darah, usus buntu, dan juga kanker prostat.\n" +
                    "Manfaat Tomat untuk Menunjang Kesehatan Tubuh\n" +
                    "Berikut ini beberapa manfaat tomat untuk kesehatan yang bisa Anda dapatkan, antara lain:\n" +
                    "\n" +
                    "1. Mengatasi peradangan\n" +
                    "Manfaat tomat yang pertama yaitu sebagai anti-peradangan karena tomat mengandung tomatine. Selain itu, khasiat tomat juga dapat mengangkat lemak dan kotoran pada wajah karena mengandung asam sitrat. Tomat juga bermanfaat untuk antioksidan karena mengandung vitamin C dan beta-karoten.\n" +
                    "\n" +
                    "2. Mencegah kerusakan kulit\n" +
                    "Menurut sebuah penelitian, likopen diduga mampu meningkatkan kemampuan kulit untuk melindungi diri dari paparan sinar ultraviolet dan membantu menjaga kulit tampak awet muda.\n" +
                    "\n" +
                    "Selain itu, kandungan vitamin C dalam tomat juga berfungsi sebagai perangsang kolagen dan antioksidan yang membantu mencegah kerusakan kulit oleh sinar matahari, polusi dan asap. Manfaat tomat untuk wajah juga membantu mencegah kerutan halus dan memperbaiki tekstur kulit secara keseluruhan.\n" +
                    "\n" +
                    "3. Menjaga kesehatan mata\n" +
                    "Manfaat tomat untuk kesehatan ternyata dapat membuat mata lebih sehat karena kandungan beta karoten. Sebuah penelitian mengungkapkan bahwa makanan kaya vitamin A mampu meningkatkan produktivitas retina terutama dalam pencahayaan yang kurang dan dalam menginterpretasikan warna serta meningkatkan perkembangan mata.\n" +
                    "\n" +
                    "4. Mengatasi penggumpalan darah\n" +
                    "Khasiat tomat berikutnya yaitu dapat mengatasi kelelahan, mencegah penggumpalan darah, dan meningkatkan jumlah sperma pada laki-laki. Selain itu, manfaat tomat juga dapat menjaga keseimbangan kesehatan tubuh.\n" +
                    "\n" +
                    "5. Mengatasi bisul\n" +
                    "Manfaat tomat yang jarang orang tahu yaitu untuk mengobati bisul. Berikut ini cara mengobati bisul dengan timat; panaskan biji tomat dan dagingnya, kemudian letakan di atas bisul selama beberapa saat.\n" +
                    "\n" +
                    "6. Mengatasi jerawat\n" +
                    "Selain bisul, manfaat tomat untuk wajah yang berjerawat. Caranya, potong tomat menjadi beberapa bagian, kemudian gosokan pada jerawat. Lakukan hal tersebut setiap hari selama 1 bulan.\n" +
                    "7. Mengatasi gangguan pencernaan\n" +
                    "Selain manfaat tomat untuk kesehatan di atas, ternyata tomat juga dapat memulihkan fungsi lever, mengatasi gangguan pencernaan, penyakit empedu, hingga mencegah kolera.\n" +
                    "\n" +
                    "8. Mengatasi penyakit jantung\n" +
                    "Antioksidan likopen yang terkandung dalam tomat dipercaya dapat mengatasi penyakit jantung, meminimalisir kerutan pada wajah dan bintik hitam karena cahaya matahari.\n" +
                    "\n" +
                    "Sejumlah penelitian menunjukkan bahwa manfaat tomat terkait erat dengan kesehatan jantung dan menurunkan faktor risiko penyakit jantung. Kandungan kalium dan likopennya efektif menurunkan kadar kolesterol jahat atau LDL dan membantu menjaga kestabilan irama jantung.\n" +
                    "\n" +
                    "Nutrisi pada tomat juga terbukti dapat mengurangi peradangan yang terkait dengan risiko penyakit jantung, serangan jantung, dan stroke, terutama pada orang dengan obesitas.\n" +
                    "\n" +
                    "9. Menjaga berat badan\n" +
                    "Manfaat tomat untuk kesehatan yang satu ini penting untuk Anda yang sedang menurunkan berat badan, karena berbagai kandungan gizi dalam buah tomat dapat mencukupi kebutuhan nutrisi saat diet. Cocok buat kamu yang ingin tubuh langsing.\n" +
                    "\n" +
                    "10. Mengobati keseleo\n" +
                    "Khasiat tomat yang selanjutnya yaitu sebagai ramuan yang dapat menyembuhkan keseleo. Caranya, hancurkan tomat bersama wijen menggunakan blender. Kemudian dipanaskan sampai berminyak. Lalu minyak tersebut digunakan untuk memijat atau mengurut sendi yang keseleo."



    };

    private static String[] moreDetailFruit = {
            "Nama :\n Apel\n\n" +
                    "Warna Kulit :\nMerah, Pink dan Hijau\n\n" +
                    "Warna Isi :\nPutih Kekuningan\n\n" +
                    "Rasa :\nManis\n\n" +
                    "Bentuk :\nBulat\n\n" +
                    "Kandungan Vitamin :\nA, B (B1, B2, B3, …) dan C",
            "Nama :\nJeruk\n\n" +
                    "Warna Kulit :\nHijau dan Orange\n\n" +
                    "Warna Isi :\nOrange\n\n" +
                    "Rasa :\nKecut dan Manis\n\n" +
                    "Bentuk :\nBulat\n\n" +
                    "Kandungan Vitamin :\nA, B1 dan C",
            "Nama :\nMangga\n\n" +
                    "Warna Kulit :\nMerah, Kuning dan Hijau\n\n" +
                    "Warna Isi :\nKuning\n\n" +
                    "Rasa :\nManis\n\n" +
                    "Bentuk :\nBulat Lonjong\n\n" +
                    "Kandungan Vitamin :\nB, C, E dan K",
            "Nama :\nPepaya\n\n" +
                    "Warna Kulit :\nHijau, Orange dan Kuning\n\n" +
                    "Warna Isi :\nOrange\n\n" +
                    "Rasa :\nManis\n\n" +
                    "Bentuk :\nLonjong\n\n" +
                    "Kandungan Vitamin :\nvitamin C dan provitamin A",
            "Nama :\nPisang\n\n" +
                    "Warna Kulit :\nKuning dan Hijau\n\n" +
                    "Warna Isi :\nPutih Kekuningan\n\n" +
                    "Rasa :\nManis\n\n" +
                    "Bentuk :\nLonjong\n\n" +
                    "Kandungan Vitamin :\nA, B1, B2 dan  C",
            "Nama :\nStrawberry\n\n" +
                    "Warna Kulit :\nMerah, Pink dan Hijau\n\n" +
                    "Warna Isi :\nPutih Kemerahmerahan\n\n" +
                    "Rasa :\nManis dan Kecut\n\n" +
                    "Bentuk :\nBulat Love\n\n" +
                    "Kandungan Vitamin :\nA, B, B1, C, folat, potassium serta asam ellagic",
            "Nama :\nNanas\n\n" +
                    "Warna Kulit :\nHijau, Kuning dan Orange\n\n" +
                    "Warna Isi :\nPutih Kekuningan\n\n" +
                    "Rasa :\nManis dan Masam\n\n" +
                    "Bentuk :\nBulat\n\n" +
                    "Kandungan Vitamin :\nC, A, B1, B6, tembaga, serat pangan, folat, dan asam pantotenik",
            "Nama :\nAvocado/Alpukat\n\n" +
                    "Warna Kulit :\nHijau\n\n" +
                    "Warna Isi :\nKuning Kehijau-hujauan\n\n" +
                    "Rasa :\nHmbar Manis\n\n" +
                    "Bentuk :\nLonjong Bulat\n\n" +
                    "Kandungan Vitamin :\n lemak sehat oleat (omega-9), A, B, B6, C, E dan zat besi",
            "Nama :\nAnggur\n\n" +
                    "Warna Kulit :\nUngu, Hitam, Hijau dan Kuning\n\n" +
                    "Warna Isi :\nPutih Bening\n\n" +
                    "Rasa :\nManis\n\n" +
                    "Bentuk :\nBulat\n\n" +
                    "Kandungan Vitamin :\nA, B komplek, C, K, asam galat, glukosida, mangan, zat besi, dan kalsium",
            "Nama :\nKiwi\n\n" +
                    "Warna Kulit :\nCokelat\n\n" +
                    "Warna Isi :\nHijau Bening\n\n" +
                    "Rasa :\nManis\n\n" +
                    "Bentuk :\nBulat\n\n" +
                    "Kandungan Vitamin :\n C, A, B, E dan K",

            "Nama :\nBuah Naga\n\n" +
                    "Warna Kulit :\nMerah, Pink dan Hijau\n\n" +
                    "Warna Isi :\nPutih atau Ungu\n\n" +
                    "Rasa :\nManis dan Hambar\n\n" +
                    "Bentuk :\nBulat\n\n" +
                    "Kandungan Vitamin :\nC, B, kalori, protein, karbohidrat, serat, kalsium, fosfor dan zat besi",

            "Nama :\nSemangka\n\n" +
                    "Warna Kulit :\nHijau dan Hitam\n\n" +
                    "Warna Isi :\nMerah atau Kuning\n\n" +
                    "Rasa :\nManis\n\n" +
                    "Bentuk :\nBulat\n\n" +
                    "Kandungan Vitamin :\nA, B (B1, B2, B3, …) dan C",

            "Nama :\nTomat\n\n" +
                    "Warna Kulit :\nMerah atau Hijau\n\n" +
                    "Warna Isi :\nmerah\n\n" +
                    "Rasa :\nkecut\n\n" +
                    "Bentuk :\nBulat\n\n" +
                    "Kandungan Vitamin :\nA, B1 dan C"
    };

    private static int[] fruitImages = {
            R.drawable.apel,
            R.drawable.jeruk,
            R.drawable.mangga,
            R.drawable.pepaya,
            R.drawable.pisang,
            R.drawable.strawberry,
            R.drawable.nanas,
            R.drawable.avocado,
            R.drawable.anggur,
            R.drawable.kiwi,
            R.drawable.buah_naga,
            R.drawable.semangka,
            R.drawable.tomat
    };

    private static String[] ratingFruit = {
            "6.1",
            "2.3",
            "4.5",
            "5.0",
            "1.2",
            "4.1",
            "3.1",
            "1.3",
            "4.5",
            "6.0",
            "5.2",
            "7.1",
            "2.3"
    };


    static ArrayList<Fruit> getListData() {
        ArrayList<Fruit> list = new ArrayList<>();
        for (int position = 0; position < fruitNames.length; position++) {
            Fruit fruit = new Fruit();
            fruit.setNamaBuah(fruitNames[position]);
            fruit.setDetail(fruitDetails[position]);
            fruit.setPhoto(fruitImages[position]);
            fruit.setMoreDetail(moreDetailFruit[position]);
            fruit.setRating(ratingFruit[position]);
            list.add(fruit);
        }
        return list;
    }

}
