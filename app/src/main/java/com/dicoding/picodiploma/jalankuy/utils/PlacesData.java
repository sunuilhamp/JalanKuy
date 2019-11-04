package com.dicoding.picodiploma.jalankuy.utils;

import com.dicoding.picodiploma.jalankuy.R;
import com.dicoding.picodiploma.jalankuy.model.Place;

import java.util.ArrayList;

public class PlacesData {

    private static String[] placeName = {
            "Danau Toba",
            "Nusa Penida",
            "Taman Laut Bunaken",
            "Wakatobi",
            "Kepulauan Raja Ampat",
            "Gunung Bromo",
            "Pulau Komodo",
            "Candi Borobudur",
            "Tana Toraja",
            "Gili Trawangan",
            "Goa Gong"
    };

    private static String[] placeLocation = {
            "Sumatera Utara",
            "Bali",
            "Sulawesi Utara",
            "Sulawesi Tenggara",
            "Papua Barat",
            "Jawa Timur",
            "Nusa Tenggara Timur",
            "Jawa Tengah",
            "Sulawesi Selatan",
            "Nusa Tenggara Barat",
            "Jawa Timur"
    };

    private static String[] placeDescription = {
            "Danau dengan keindahan yang tidak tertandingi ini merupakan danau vulkanik terbesar di Asia Tenggara dan terbesar kedua di dunia setelah Danau Victoria. Danau Toba sudah lama terkenal sebagai salah satu objek wisata Indonesia favorit yang sering dikunjungi sejak tahun 1980-an lho!\n" +
                    "\n" +
                    "Objek wisata Nusantara yang terkenal di Dunia ini memiliki luas 1.145 kilometer persegi dan sebenarnya lebih tepat disebut laut karena dengan luas sebesar itu di tengahnya terdapat pulau Samosir yang luasnya hampir sebanding dengan negara Singapura. Bisa bayangin kan Kalian betapa megahnya danau di Sumatera Utara ini?\n" +
                    "\n" +
                    "Selain itu, danau ini juga termasuk salah satu danau terdalam di dunia dengan kedalaman sekitar 450 meter. Buat Kalian yang sedang atau ingin berkunjung ke Medan, Sumatera Utara tidak boleh lupa untuk mampir menikmati keindahan Danau Toba, ya.",
            "Pulau Bali, sudah tidak bisa dipungkiri lagi namanya memang merajalela ke seluruh dunia karena pemandangannya yang indah, budayanya yang masih kental terasa dan pantai nya yang eksotis. Saat Kalian berkunjung ke Bali jangan heran kalau banyak banget turis berlalu lalang di sana, bahkan beberapa ada yang menetap di Bali lho!\n" +
                    "\n" +
                    "Salah satu objek wisata di Bali yang populer di mata dunia saat ini adalah Nusa Penida. Tempat wisata Indonesia favorit ini adalah pilihan tepat untuk Kalian yang suka melakukan Island Hoping, dan menikmati keindahan bawah laut dengan snorkeling.\n" +
                    "\n" +
                    "Dengan panorama pantai yang indah Nusa Penida dan pulau-pulau kecil sekitarnya menawarkan pengalaman berbeda dan tentunya akan memanjakan Kalian yang juga memiliki hobi fotografi.",
            "Destinasi wisata populer di Indonesia lainnya yang juga ramai dikunjungi wisatawan asing adalah Taman Laut Bunaken yang tepatnya berada di Teluk Manado. Bunaken menjadi salah satu objek wisata di Indonesia yang mengundang decak kagum karena keindahan taman bawah lautnya yang sulit ditemukan di negara lain.\n" +
                    "\n" +
                    "Berkunjung ke Taman Laut Bunaken, Kalian akan menemukan keindahan kehidupan di dalam laut yang membuat mata kamu tidak bisa berhenti memandangnya. Di dalam taman laut ini terdapat 13 jenis terumbu karang yang didominasi dengan bebatuan laut.\n" +
                    "\n" +
                    "Selain itu, pemandangan yang paling menarik adalah adanya terumbu karang terjal vertikal yang menjulang ke bawah sedalam 25 – 50 meter. Tidak sampai di situ, mata kita akan dimanjakan dengan 91 jenis ikan yang ada di dalamnya.\n" +
                    "\n" +
                    "Tidak heran kalau Taman Laut Bunaken menjadi salah satu destinasi bagi para wisatawan terutama para pecinta laut. Apalagi tujuan wisata Indonesia favorit wisatawan asing ini menyediakan fasilitas untuk scuba diving dengan 20 titik penyelaman terbaik, dimana penyelam dapat kesempatan berenang di dasar laut dengan beragam biota laut yang menakjubkan.",
            "Masih berada di Pulau Sulawesi, Taman Nasional Wakatobi juga merupakan salah satu tujuan wisata dunia bagi yang ingin mengeksplorasi keindahan alam bawah laut. Dengan luas mencapai 13.900 km2, tujuan wisata terkenal asal Indonesia ini memiliki tak kurang dari 112 jenis terumbu karang yang bersimbiosis dengan ikan-ikan bawah laut sehingga menciptakan panorama bawah laut yang tiada tanding.\n" +
                    "\n" +
                    "Hal ini menjadikan Wakatobi sebagai salah satu surga menyelam bagi para traveler dari berbagai penjuru dunia.",
            "Surga dunia di Indonesia selanjutnya adalah kepulauan Raja Ampat yang terletak di Papua Barat dengan kekayaan laut terlengkap di bumi. Raja Ampat atau Empat Raja merupakan 4 pulau indah yang merupakan penghasil lukisan batu kuno. Empat pulau utama yang dimaksud adalah Waigeo, Salawati, Batanta, dan Misool.\n" +
                    "\n" +
                    "Nama – nama tersebut berasal dari mitos lokal dari warga – warga di sekitar pulau Raja Ampat. Keindahan dan kemegahan dari objek wisata populer asal Indonesia ini mampu mengundang para wisatawan dari seluruh dunia untuk datang ke sini dan merasakan pengalaman sekaligus pemandangan yang tidak akan terlupakan.\n" +
                    "\n" +
                    "Dengan wilayah pulau mencakup hingga 4,6 juta hektar tanah dan laut, kita bisa menemukan 540 jenis karang, 1.511 spesies ikan, serta 700 jenis moluska. Perlu Kalian ketahui, menurut laporan The Nature Conservancy and Conservation International, ada sekitar 75% spesies laut dunia tinggal di pulau yang menakjubkan ini.",
            "Kalau kamu pernah berkunjung ke Jawa Timur gak lengkap rasanya kalau belum menginjakkan kaki ke Gunung Bromo ini. Salah satu gunung berapi yang masih aktif ini memiliki pesona  dengan dikelilingi pasir laut yang luas. Meskipun bukan salah satu gunung tertinggi di Indonesia, namun keindahan Gunung Bromo tidak ada duanya dan membuat para pengunjung dapat merasakan pemandangan yang fantastis dan spektakuler.\n" +
                    "\n" +
                    "Wisatawan dapat berkuda dan mendaki gunung bromo untuk menikmati keindahan yang menawan saat matahari terbit dan terbenam. Bisa jadi pengalaman secara langsung yang tidak terlupakan lho Guys! Dengan keindahan yang menakjubkan itu tidak heran jika objek wisata di Indonesia satu ini menjadi para wisatawan mancanegara yang berkunjung ke Indonesia.",
            "Destinasi wisata Indonesia yang tersohor di mata dunia selanjutnya adalah Pulau Komodo. Pulau yang berlokasi di Kepulauan Nusa Tenggara Timur ini merupakan rumah bagi ratusan Komodo, hewan endemik yang dilindungi di Indonesia.\n" +
                    "\n" +
                    "Selain bisa mengamati perilaku dan mengeksplorasi habitat dari hewan purba ini, Pulau Komodo juga menawarkan panorama alam yang menakjubkan. Salah satunya adalah pantai dengan pasir berwarna merah muda yang dikenal dengan nama “Pink Beach“. Di dunia sendiri pantai seperti ini hanya terdapat tujuh di seluruh dunia menjadikannya sebagai salah satu tujuan wisata Indonesia yang mendunia.",
            "Salah satu ikon wisata budaya Indonesia yang mendunia lainnya adalah Candi Borobudur. Sebagai candi Budha terbesar di dunia dengan luas tak kurang dari 123 X 123 meter, objek wisata populer asal Indonesia yang berada di Magelang ini merupakan warisan budaya dan sejarah Indonesia yang terkenal akan arsitektur yang memukau.\n" +
                    "\n" +
                    "Setiap tahunnya, tak cuma wisatawan domestik tetapi banyak juga wisatawan asing yang tertarik untuk mengamati keindahan dari Candi Borobudur. Berbagai relief yang menceritakan mengenai berbagai ajaran dalam agama Budha dan perjalanan hidup Sidharta Gautama hingga mencapai pencerahan sempurna bisa Kalian temukan di tempat wisata favorit asal Indonesia.\n" +
                    "\n" +
                    "Candi Borobudur sendiri memiliki total tak kurang dari 504 arca Buddha dan 2.672 panel relief pada dinding-dindingnya. Menakjubkan sekali, bukan?",
            "Indonesia memang kaya akan adat dan budaya yang menarik mata dunia. Salah satu destinasi wisata Indonesia yang terkenal akan kekayaan tradisi budayanya adalah  Kabupaten Tana Toraja.\n" +
                    "\n" +
                    "Terletak di Sulawesi Selatan dikawasan pegunungan yang indah, Kalian masih bisa melihat uniknya keseharian dan tradisi masyarakat adat Tana Toraja. Selain keindahan arsitektur tradisional rumah tongkonan, wisatawan juga bisa mengamati tradisi unik upacara kematian yang dikenal sebagai Rambu Solo yang biasanya diselenggarakan pada Juli dan Agustus\n" +
                    "\n" +
                    "Keunikan dari tradisi ini menjadikan Tana Toraja sebagai tempat wisata asal Indonesia yang memiliki daya tarik mendunia.",
            "Untuk pecinta pemandangan pantai, Gili Trawangan bisa jadi pilihan objek wisata Nusantara mendunia yang Kalian singgahi. Dengan kombinasi langit biru dengan semburat awan putih, jernihnya air laut dibingkai pasir putih menjadikan Gili Trawangan sebagai tujuan wisata populer baik bagi wisatawan dalam negeri dan luar negeri.\n" +
                    "\n" +
                    "Selain pantai dan alam bawah laut, tempat wisata Nusantara yang berada di Provinsi Nusa Tenggara Barat ini juga memiliki berbagai lansekap menakjubkan dan juga spot-spot foto yang instagramable, lho.",
            "Tujuan wisata Indonesia yang mendunia selanjutnya adalah Goa Gong yang terletak di Pacitan, Jawa Timur. Panorama eksotik yang ditawarkan oleh objek wisata alam Indoneisa ini disebut-sebut sebagai salah satu goa terindah di Asia Tenggara.\n" +
                    "\n" +
                    "Bertualang di Goa Gong, Kalian akan disuguhkan keeksotisan struktur stalaktit dan stalakmit yang terbentuk secara alami di Goa ini. Meskipun tidak sepopuler tempat wisata Indonesia lainnya, Goa Gong merupakan destinasi wisata favorit bagi para traveler dunia yang berjiwa petualang."
    };

    private static int[] placeImages = {
            R.drawable.danau_toba,
            R.drawable.nusa_penida,
            R.drawable.bunaken,
            R.drawable.wakatobi,
            R.drawable.raja_ampat,
            R.drawable.bromo,
            R.drawable.komodo,
            R.drawable.borobudur,
            R.drawable.toraja,
            R.drawable.gili_trawangan,
            R.drawable.goa_gong
    };

    public static ArrayList<Place> getListData() {
        ArrayList<Place> list = new ArrayList<>();
        for (int position = 0; position < placeName.length; position++) {
            Place place = new Place();
            place.setName(placeName[position]);
            place.setLocation(placeLocation[position]);
            place.setDescription(placeDescription[position]);
            place.setPhoto(placeImages[position]);
            list.add(place);
        }
        return list;
    }
}
