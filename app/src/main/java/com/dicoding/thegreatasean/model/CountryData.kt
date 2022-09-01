package com.dicoding.thegreatasean.model

import com.dicoding.thegreatasean.R

object CountryData {
    private val countryNames = arrayOf("Brunei Darussalam",
                "Filipina",
                "Indonesia",
                "Kamboja",
                "Laos",
                "Malaysia",
                "Myanmar",
                "Singapura",
                "Thailand",
                "Vietnam")

    private val countryDetails = arrayOf(
            //Brunei Darussalam
            "Negara mungil yang memiliki luas wilayah sekitar 5,765 km persegi ini memiliki standar hidup yang cukup tinggi, dan termasuk negara kaya di Asia. Sejak lama, Brunei mengandalkan minyak dan gas sebagai tulang punggung ekonomi.\n" +
                    "\n" +
                    "Terletak di bagian barat laut pulau Borneo (Kalimantan), Brunei adalah negara kesultanan Islam. Negara dengan ibu kota di Bandar Seri Begawan ini merdeka tahun 1984 setelah lama menjadi protektorat Inggris sejak 1888. Sistem pemerintahan Brunei berbentuk monarki absolut. Sultan sekaligus Perdana Menteri Brunei Darussalam saat ini adalah Hassanal Bolkiah.\n" +
                    "\n" +
                    "Budaya negara Brunei berakar kuat pada asal-usul melayunya yang juga tercermin dari gaya arsitektur, bahasa, dan adat. Maka itu, bahasa nasional Brunei adalah bahasa melayu, diikuti dengan bahasa Inggris sebagai bahasa kedua paling populer di negara tersebut. Brunei mulai resmi menjadi anggota ASEAN pada tahun 1984. Brunei bergabung menjadi anggota ASEAN setelah mendapatkan kemerdekaannya.\n" +
                    "\n" +
                    "Keterangan:\n" +
                    "Nama Negara: Brunei Darussalam\n" +
                    "Kepala Negara: Sultan\n" +
                    "Kepala Pemerintahan: Perdana Menteri\n" +
                    "Ibu Kota Brunei: Bandar Seri Begawan\n" +
                    "Hari Kemerdekaan: 23 Februari\n" +
                    "Bahasa: Melayu, Inggris, dan Mandarin\n" +
                    "Mata Uang: Dolar Brunei (BND)\n" +
                    "Populasi: 423.196 jiwa (2016)\n" +
                    "Luas Wilayah: 5.765 km persegi.\n",

            //Filipina
            "Negara kepulauan yang terbentuk dari kurang lebih 7,000 pulau ini juga menjadi salah satu pelopor terbentuknya ASEAN. Terletak di sebelah barat lautan Pasifik, Filipina merupakan negara yang memiliki populasi mencapai lebih dari 109 juta penduduk pada tahun 2019.\n" +
                    "\n" +
                    "Selama kurang lebih 300 tahun, Filipina berada di bawah kolonialisme Spanyol. Pada tahun 1898, Filipina berhasil merdeka dari penjajahan Spanyol. Namun, AS merebut kekuasaan Spanyol di Filipina di perang Spanish-American War. Hal itu membuat Filipina dikuasai AS yang diikuti pecahnya perang Philippine-American War pada tahun 1899 hingga 1902.\n" +
                    "\n" +
                    "Invasi Spanyol dan Amerika memberikan banyak pengaruh terutama pada bahasa, agama dan gaya pemerintahan negara Filipina. Saat ini, Filipina menganut sistem demokrasi dan memiliki bentuk pemerintahan republik. Negara dengan ibu kota Manila itu menunjuk kepala negara yaitu Presiden melalui pemilu langsung.\n\nKeterangan:\n" +
                    "Nama Negara: Filipina (Republic of the Philippines)\n" +
                    "Kepala Negara: Presiden\n" +
                    "Kepala Pemerintahan: Presiden\n" +
                    "Ibu Kota Filipina: Manila\n" +
                    "Hari Kemerdekaan: 12 Juni\n" +
                    "Bahasa: Filipino/Tagalog dan Inggris\n" +
                    "Mata Uang: Peso (PHP)\n" +
                    "Luas Wilayah: 343.448 km persegi.\n",

            //Indonesia
            "Negara kepulauan dengan total penduduk sekitar 272.229.372 jiwa (per Juni 2021) ini memiliki wilayah yang ada di antara benua Asia dan Australia. Posisi geografis yang berada sebagai titik silang perekonomian dunia ini pun sangat berpengaruh terhadap aktivitas perdagangan Indonesia.\n" +
                    "\n" +
                    "Menelisik sejarahnya, Indonesia sempat mengalami pahitnya kolonialisme Belanda dan juga Jepang selama lebih dari 300 tahun. Setelah Jepang kalah di Perang Dunia II, Republik Indonesia akhirnya berdiri menjadi negara yang merdeka sejak 17 Agustus 1945.\n" +
                    "\n" +
                    "Setelah 76 tahun Indonesia merdeka, negara dengan ibu kota Jakarta ini dipimpin oleh Presiden Joko Widodo. Ini bukanlah kali pertama Presiden Joko Widodo menjabat sebagai kepala negara. Setelah masa jabatannya habis di tahun 2019, Joko widodo kembali memenangkan pemilihan umum di tahun yang sama.\n" +
                    "\n" +
                    "Republik dengan bentuk negara kesatuan ini memiliki ideologi Pancasila yang sekaligus menjadi pedoman bagi seluruh warganya. Berasas demokrasi, Indonesia memiliki sistem pemerintahan presidensial.\n" +
                    "\n" +
                    "Keterangan:\n" +
                    "Nama Negara: Repulik Indonesia\n" +
                    "Kepala Negara: Presiden\n" +
                    "Kepala Pemerintahan: Presiden\n" +
                    "Ibu Kota: Jakarta\n" +
                    "Hari Kemerdekaan: 17 Agustus\n" +
                    "Bahasa: Bahasa Indonesia\n" +
                    "Mata Uang: Rupiah (IDR)\n" +
                    "Luas Wilayah: 1.904.569 km persegi\n",

            //Kamboja
            "Kamboja merupakan salah satu negara terakhir yang diterima menjadi bagian dari ASEAN di tahun 1999. Negara Kamboja terkenal sebagai pengekspor garmen. Sektor pariwisata Kamboja pun cukup kuat. Hal ini menjadikan Kamboja salah satu negara dengan pertumbuhan ekonomi pesat di Asia Tenggara.\n" +
                    "\n" +
                    "Ibu kota Kamboja yang terletak di Phnom Penh dulu dijuluki sebagai mutiara Asia. Julukan tersebut diberikan karena kota Phnom Penh menjadi pusat ekonomi, komersial, budaya dan wisata negara Kamboja.\n" +
                    "\n" +
                    "Kamboja menganut sistem monarki konstitusional dengan bentuk pemerintahan kerajaan. Sistem ini menjadikan raja sebagai kepala negara, sementara pemerintahan dipimpin oleh perdana menteri. Kini, Norodom Sihamoni adalah raja Kamboja sejak meneruskan tahta sang ayah pada 2004.\n" +
                    "\n" +
                    "Keterangan:\n" +
                    "Nama Negara: Kamboja (Kingdom of Cambodia)\n" +
                    "Kepala Negara: Raja\n" +
                    "Kepala Pemerintahan: Perdana Menteri\n" +
                    "Ibu Kota Kamboja: Phnom Penh\n" +
                    "Hari Kemerdekaan: 9 November\n" +
                    "Bahasa: Khmer, Perancis, dan Inggris\n" +
                    "Mata Uang Kamboja: Riel (KHR)\n" +
                    "Populasi: 15,76 juta jiwa (2016)\n" +
                    "Luas Wilayah: 181.035 km persegi.\n",

            //Laos
            "Pada ulang tahun ASEAN yang ke-30, Laos memutuskan untuk bergabung dengan negara-negara Asia Tenggara lainnya di tahun 1997. Memiliki wilayah di jantung daratan Asia Tenggara, Laos adalah negara dengan populasi sekitar 7,16 juta penduduk.\n" +
                    "\n" +
                    "Menggantikan kerajaan Laos, Republik Demokratik Rakyat Laos didirikan pada Desember 1975. Dilansir dari laman UNDP, perkembangan Laos dalam pengentasan kemiskinan dapat dilihat secara signifikan selama dua dekade. Hal ini dibuktikan dengan data UNDP, bahwa tingkat kemiskinan turun 23% dari tahun 1992 hingga 2015. Laos memiliki sumber daya alam yang cukup melimpah. Sejumlah peninggalan bersejarah dan keindahan alam di Laos menjadikan negara ini populer bagi turis internasional.\n" +
                    "\n" +
                    "Keterangan:\n" +
                    "Nama Negara: Laos (Lao People’s Democratic Republic)\n" +
                    "Kepala Negara: Presiden\n" +
                    "Kepala Pemerintahan: Perdana Menteri\n" +
                    "Ibu Kota Laos: Vientiane\n" +
                    "Hari Kemerdekaan: 2 Desember\n" +
                    "Bahasa: Lao, Prancis, dan Inggris\n" +
                    "Mata Uang Laos: Kip (LAK)\n" +
                    "Luas Wilayah: 237.955 km persegi.\n",

            //Malaysia
            "Sebagai salah satu dari lima negara pelopor ASEAN, negara tetangga Indonesia ini memiliki 13 negara bagian dan 3 wilayah federal. Setelah lepas dari jajahan Inggris, Malaysia sekarang menjadi bagian dari Commonwealth.\n" +
                    "\n" +
                    "Negara dengan ibu kota di Kuala Lumpur ini memiliki bahasa nasional yaitu Bahasa Malaysia, dengan mata uang Malaysian Ringgit. Saat ini, pemerintahan Malaysia menganut demokrasi parlementer dengan sistem monarki konstitusional. Oleh karena itu, raja berperan sebagai Kepala Negara sementara perdana menteri menduduki posisi sebagai kepala pemerintahan.\n" +
                    "\n" +
                    "Di akhir tahun 2020, populasi negara Malaysia mencapai 32,6 juta penduduk. Penduduk Malaysia datang dari berbagai kelompok etnis. Lebih dari 69% didominasi oleh bumiputera meliputi Orang Asli, Sarawak, Sabah dan penduduk asli Melayu.\n" +
                    "\n" +
                    "Keterangan:\n" +
                    "Nama Negara: Malaysia (Malaysia)\n" +
                    "Kepala Negara: Raja\n" +
                    "Kepala Pemerintahan: Perdana Menteri\n" +
                    "Ibu Kota Malaysia: Kuala Lumpur\n" +
                    "Hari Kemerdekaan: 31 Agustus\n" +
                    "Bahasa: Melayu, Inggris, Cina, dan Tamil\n" +
                    "Mata Uang: Ringgit (MYR)\n" +
                    "Luas Wilayah: 329.847 km persegi.\n",

            //Myanmar
            "Myanmar adalah negara terbesar di daratan Asia Tenggara. Myanmar memutuskan bergabung menjadi anggota resmi ASEAN pada Juli 1997. Sama dengan Laos, negara ini bergabung tepat pada ulang-tahun ASEAN ke-30. Wilayah Myanmar terletak di bagian barat daratan Asia Tenggara. Saat ini, populasi Myanmar mencapai 54,2 juta penduduk dengan ibu kota di Naypyitaw.\n" +
                    "\n" +
                    "Sebenarnya, bentuk pemerintahan Myanmar menganut sistem republik, dengan kepala negara seorang Presiden. Namun, Myanmar kini berada di bawah junta militer dan sampai pertengahan 2021 masih dilanda kemelut politik.\n" +
                    "\n" +
                    "Keterangan:\n" +
                    "Nama Negara: Myanmar (Republic of the Union of Myanmar)\n" +
                    "Kepala Negara: Presiden\n" +
                    "Kepala Pemerintahan: Perdana Menteri\n" +
                    "Ibu Kota Myanmar: Nay Pyi Taw (Naypyidaw)\n" +
                    "Hari Kemerdekaan: 4 Januari\n" +
                    "Bahasa: Burma\n" +
                    "Mata Uang Myanmar: Kyat (MMK)\n" +
                    "Populasi: 52,89 juta jiwa (2016)\n" +
                    "Luas Wilayah: 676.578 km persegi.\n",

            //Singapura
            "Selain Malaysia, Singapura juga menjadi salah satu negara ASEAN yang bergabung pada Commonwealth selepas merdeka dari Inggris. Singapura juga menjadi salah satu pelopor terbentuknya ASEAN. Negara pulau dengan populasi sekitar 5,7 juta penduduk ini memiliki ibu kota yang juga bernama Singapura. Ada empat bahasa resmi di Singapura, yakni Inggris, Mandarin, Melayu dan Tamil.\n" +
                    "\n" +
                    "Republik Parlementer merupakan bentuk pemerintahan Singapura, yang mana kepala negara dijabat oleh seorang presiden. Sementara itu, perdana menteri mempunyai peran sebagai kepala pemerintahan di Singapura.\n" +
                    "\n" +
                    "Lee Hsien Loong, anak tertua dari PM pertama Singapura yaitu Lee Kuan Yew, saat ini sedang menjabat sebagai perdana menteri. Loong sejak tahun 2014 hingga kini menyandang posisinya tersebut.\n" +
                    "\n" +
                    "Keterangan:\n" +
                    "Nama Negara: Singapura (Republic of Singapore)\n" +
                    "Kepala Negara: Presiden\n" +
                    "Kepala Pemerintahan: Perdana Menteri\n" +
                    "Ibu Kota: Singapura\n" +
                    "Hari Kemerdekaan: 9 Agustus\n" +
                    "Bahasa: Inggris, Cina Mandarin, Melayu, dan Tamil\n" +
                    "Mata Uang: Dolar Singapura (SGD)\n" +
                    "Populasi: 5,61 juta jiwa (2016)\n" +
                    "Luas Wilayah: 721,5 km persegi.\n",

            //Thailand
            "Negara yang dijuluki sebagai Negeri Gajah ini adalah negara ASEAN yang tidak pernah merasakan kolonialisme bangsa Eropa. Berbatasan dengan Laos dan Kamboja, Thailand memiliki sistem pemerintahan berbentuk monarki konstitusional. Hal ini menjadikan kepala negara Thailand adalah seorang raja.\n" +
                    "\n" +
                    "Perihal urusan kenegaraan dan pemerintahan, Thailand menyerahkan pekerjaan kepada seorang Perdana Menteri. Saat ini (2021), Prayut Chan-o-cha menduduki posisi sebagai perdana menteri Thailand sejak tahun 2014 silam.\n" +
                    "\n" +
                    "Sebelum tahun 1980, para elite militer mendominasi politik di Thailand. Namun setelah dekade 1980-an, parlemen yang terpilih mulai memiliki pengaruh dalam politik di sana. Majelis Nasional yang terpilih juga mulai mengambil alih kekuasaan pemerintahan Thailand di tahun 1992. Meskipun kekuasaan militer sudah tidak lagi berpengaruh di pemerintahan, Thailand sempat dilanda kisruh akibat dua kali kudeta pada tahun 2006-2007 dan 2014.\n" +
                    "\n" +
                    "Keterangan:\n" +
                    "Nama Negara: Thailand (Kingdom of Thailand)\n" +
                    "Kepala Negara: Raja\n" +
                    "Kepala Pemerintahan: Perdana Menteri\n" +
                    "Ibu Kota Thailand: Bangkok\n" +
                    "Hari Kemerdekaan: 5 Desember\n" +
                    "Bahasa: Thai\n" +
                    "Mata Uang: Baht (THB)\n" +
                    "Populasi: 68.86 juta jiwa (2016)\n" +
                    "Luas Wilayah: 513.120 km persegi.\n",

            //Vietnam
            "Negara Vietnam merupakan salah satu dari tiga negara terakhir yang resmi menjadi bagian dari ASEAN. Vietnam sebenarnya sudah menyatakan ketertarikannya untuk gabung dengan ASEAN sejak tahun 1992. Pada akhirnya, di tahun 1995, negara dengan ibu kota Hanoi itu mengikuti jejak kawan-kawannya di Asia Tenggara untuk bergabung dengan ASEAN.\n" +
                    "\n" +
                    "Bentuk negara Vietnam adalah sistem republik komunis, dengan Partai Komunis Vietnam tetap menjadi institusi politik yang dominan. Kepala negara Vietnam dijabat presiden, sementara urusan pemerintahan dipegang perdana menteri. Pham Minh Chinh baru saja terpilih jadi perdana menteri Vietnam pada April 2021, menggantikan Nguyễn Xuân Phúc.\n" +
                    "\n" +
                    "Perekonomian Vietnam yang berkembang pesat didukung oleh industri yang bergerak di bidang ritel, manufaktur, makanan, pertanian dan infrastruktur. Selain itu, sektor pariwisata juga menjadi salah satu kontributor terbesar bagi perekonomian Vietnam. Pada 2019, Vietnam dinobatkan sebagai Asia’s Leading Destination oleh WTA (World Travel Awards).\n" +
                    "\n" +
                    "Keterangan:\n" +
                    "Nama Negara: Vietnam (Socialist Republic of Vietnam)\n" +
                    "Kepala Negara: Presiden\n" +
                    "Kepala Pemerintahan: Perdana Menteri\n" +
                    "Ibu Kota Vietnam: Hanoi\n" +
                    "Hari Kemerdekaan: 2 September\n" +
                    "Bahasa: Vietnam\n" +
                    "Mata Uang Vietnam: Dong (VND)\n" +
                    "Populasi: 92,7 juta jiwa (2016)\n" +
                    "Luas Wilayah: 331.230,8 km persegi.\n")

    private val countryFlags = intArrayOf(
        R.drawable.brunei_flag,
        R.drawable.filipina_flag,
        R.drawable.indonesia_flag,
        R.drawable.kamboja_flag,
        R.drawable.laos_flag,
        R.drawable.malaysia_flag,
        R.drawable.myanmar_flag,
        R.drawable.singapura_flag,
        R.drawable.thailand_flag,
        R.drawable.vietnam_flag
    )

    private val countryViews = intArrayOf(
        R.drawable.brunei_view,
        R.drawable.filipina_view,
        R.drawable.indonesia_view,
        R.drawable.kamboja_view,
        R.drawable.laos_view,
        R.drawable.malaysia_view,
        R.drawable.myanmar_view,
        R.drawable.singapura_view,
        R.drawable.thailand_view,
        R.drawable.vietnam_view
    )

    private val countryHeadOfStateNames = arrayOf("Sultan Hassanal Bolkiah",
    "Rodrigo Duterte",
    "Joko Widodo",
    "Raja Norodom Sihamoni",
    "Thongloun Sisoulith",
    "Sultan Abdullah",
    "Myint Swe",
    "Halimah Yacob",
    "Raja Vajiralongkorn",
    "Nguyen Xuan Phuc")

    private val countryHeadOfStatePhotos = intArrayOf(
        R.drawable.brunei_sultan_hassanal_bolkiah,
        R.drawable.filipina_president_rodrigo_duterte,
        R.drawable.indonesia_president_joko_widodo,
        R.drawable.kamboja_king_norodom_sihamoni,
        R.drawable.laos_president_thongloun_sisoulith,
        R.drawable.malaysia_sultan_abdullah,
        R.drawable.myanmar_myint_swe,
        R.drawable.singapura_halimah_yacob,
        R.drawable.thailand_king_vajiralongkorn,
        R.drawable.vietnam_president_nguyen_xuan_phuc
    )

    private val countryLink = arrayOf(
        "https://en.wikipedia.org/wiki/Brunei",
        "https://en.wikipedia.org/wiki/Philippines",
        "https://en.wikipedia.org/wiki/Indonesia",
        "https://en.wikipedia.org/wiki/Cambodia",
        "https://en.wikipedia.org/wiki/Laos",
        "https://en.wikipedia.org/wiki/Malaysia",
        "https://en.wikipedia.org/wiki/Myanmar",
        "https://en.wikipedia.org/wiki/Singapore",
        "https://en.wikipedia.org/wiki/Thailand",
        "https://en.wikipedia.org/wiki/Vietnam"

    )

    val listData: MutableList<Country>
        get() {
            val list = arrayListOf<Country>()
            for (position in countryNames.indices) {
                val country = Country()
                country.name = countryNames[position]
                country.detail = countryDetails[position]
                country.flag = countryFlags[position]
                country.view = countryViews[position]
                country.headOfStateName = countryHeadOfStateNames[position]
                country.headOfStatePhoto = countryHeadOfStatePhotos[position]
                country.link = countryLink[position]
                list.add(country)
            }
            return list
    }
}