package com.ryandhikaba.dicodingandroidpemula.Submission.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ServiceModel(
    val name: String,
    val description: String,
    val price: String,
    val duration: String,
    val benefits: String,
    val photo: String
) : Parcelable

val     carDetailingServices = listOf(
    ServiceModel(
        name = "GPS Tracker VT-330",
        description = "VT-330 merupakan tracker yang sudah berstandar 3G, sehingga kekuatan sinyalnya dijamin lebih stabil dan lebih kuat. Data yang ditampilkan juga akan dijamin selalu akurat. Bentuknya yang mini, membuat tracker ini sangat fleksibel untuk ditempatkan pada sudut tersembunyi sekalipun.",
        price = "Rp1.849.000",
        duration = "4 jam",
        benefits = "- Jaringan 3G\n" +
                "- Lacak posisi kendaraan\n" +
                "- Matikan mesin jarak jauh\n" +
                "- Dengar Percakapan Dalam Kabin\n" +
                "- SOS ( Panic Button )\n" +
                "- Garansi suku cadang 2 tahun\n" +
                "- Harga sudah termasuk Sim Card + Pulsa 6 bulan\n" +
                "Free Pemasangan Khusus DKI JAKARTA",
        "https://imgx.gridoto.com/crop/0x0:0x0/700x500/photo/2019/05/05/3208675450.jpeg"
    ),ServiceModel(
        name = "Deep Clean & Shine",
        description = "Paket Deep Clean & Shine adalah layanan detail mobil terbaik kami. Layanan ini mencakup pembersihan menyeluruh di dalam dan di luar mobil Anda, termasuk vakum, mencuci eksterior, poles, dan waxing. Kami juga akan membersihkan dan menyemir mesin Anda untuk memberikan kilauan ekstra.",
        price = "Rp300.000",
        duration = "4 jam",
        benefits = "- Membersihkan mobil secara menyeluruh\n- Perlindungan ekstra untuk cat mobil\n- Interior dan eksterior yang bersih dan berkilau",
        "https://i0.wp.com/www.rukita.co/stories/wp-content/uploads/2020/02/salon-mobil-cover.jpg?fit=1280%2C720&ssl=1"
    ),
    ServiceModel(
        name = "Interior Refresh",
        description = "Paket Interior Refresh dirancang untuk memberikan lingkungan yang bersih dan nyaman di dalam mobil Anda. Layanan ini mencakup vakum menyeluruh, pembersihan jok, dashboard, dan panel pintu. Kami juga akan menyegarkan aroma di dalam mobil Anda.",
        price = "Rp250.000",
        duration = "2 jam",
        benefits = "- Lingkungan yang bersih dan nyaman di dalam mobil\n- Aroma yang menyegarkan\n- Penyegaran interior yang komprehensif",
        "https://permagardindia.com/wp-content/uploads/2019/12/Permagard-Garage-51-min-scaled.jpg"
    ),
    ServiceModel(
        name = "Exterior Revive",
        description = "Paket Exterior Revive akan memperindah penampilan luar mobil Anda. Layanan ini mencakup pencucian eksterior menyeluruh, poles, dan aplikasi pelindung untuk cat mobil Anda. Kami akan meningkatkan kilau dan melindungi cat mobil Anda dari kerusakan.",
        price = "Rp350.000",
        duration = "3 jam",
        benefits = "- Penampilan luar mobil yang memukau\n- Perlindungan cat yang kuat\n- Melindungi cat dari kerusakan",
        "https://d1hv7ee95zft1i.cloudfront.net/custom/blog-post/mobile/featured/10-cheap-ways-to-detail-your-car-like-a-pro-6103daf03f157.jpg"
    ),
    ServiceModel(
        name = "Basic Tint",
        description = "Pemasangan kaca film standar untuk jendela mobil. Kaca film ini akan membantu mengurangi panas dan cahaya matahari yang masuk ke dalam mobil, serta memberikan privasi kepada penumpang.",
        price = "Mulai dari Rp500.000",
        duration = "2 jam",
        benefits = "- Mengurangi panas dan cahaya matahari\n- Memberikan privasi kepada penumpang",
        "https://www.divineshinedetailing.com/uploads/7/3/8/1/73817219/shade-levels_orig.jpg"
    ),
    ServiceModel(
        name = "UV Protection Plus",
        description = "Paket UV Protection Plus menyediakan perlindungan tambahan terhadap sinar UV yang berbahaya. Kaca film ini membantu melindungi penumpang dari paparan sinar UV, mencegah penuaan dini dan kanker kulit.",
        price = "Mulai dari Rp800.000",
        duration = "3 jam",
        benefits = "- Melindungi penumpang dari sinar UV yang berbahaya\n- Mencegah penuaan dini dan kanker kulit\n- Menambah kenyamanan di dalam mobil",
        "https://www.austinclearbra.com/wp-content/uploads/sites/6/2023/07/xpel-prime-xr-windshield-film-4-768x512.jpg"
    ),
    ServiceModel(
        name = "Security Shield",
        description = "Pemasangan kaca film khusus dengan ketahanan terhadap pecah dan serangan. Kaca film ini akan meningkatkan keamanan kendaraan Anda dan melindungi penumpang dari serangan langsung atau upaya perampokan.",
        price = "Mulai dari Rp1.200.000",
        duration = "4 jam",
        benefits = "- Melindungi penumpang dari serangan langsung atau upaya perampokan\n- Meningkatkan keamanan kendaraan",
        "https://altdriver.com/wp-content/uploads/sites/2/2021/03/best-car-windshield-sun-shade-FI.jpg"
    ),
    ServiceModel(
        name = "PAKET BANJIR",
        description = "Mobil Bersih Seperti Baru Setelah Terendam Banjir. Jangan biarkan lumpur dan bau apek setelah banjir tertinggal di mobil Anda",
        price = "Mulai Rp9.000.000",
        duration = "8 jam",
        benefits = "- Sisa Lumpur Hilang\n" +
                "- Bau Apek Lenyap\n" +
                "- Mobil Bersih Seperti Baru",
        "https://mobiklin.id/wp-content/uploads/2020/06/Mobiklin_Banjir_Gallery_2.jpg"
    ),
    ServiceModel(
        name = "Glass Fusion",
        description = "Glass Fusion adalah solusi perawatan kaca mobil untuk mencegah kerak air dan noda permanen. Serta memberikan efek daun talas pada kaca mobil sehingga sangat membantu jika terjadi hujan deras ketika sedang berkendara.",
        price = "Rp1.250.000",
        duration = "2-3 jam",
        benefits = "– Merawat dan melindungi kaca dari noda kerak air dan jamur.\n" +
                "– Jaminan 2 tahun dengan perawatan gratis setiap 6 bulan sekali selama 3x.\n" +
                "– Menciptakan efek daun talas pada kaca\n" +
                "– Menjaga visibilitas dan meningkatkan kejernihan kaca hingga 20%\n" +
                "– Mengurangi silau di malam hari hingga 35 %",
        "https://i.ytimg.com/vi/Gcc3HMCeZv8/maxresdefault.jpg"
    ),ServiceModel(
        name = "TIRE & RIMS DETAILING",
        description = "Tampil Menawan Dengan Ban Bersih dan Velg Mengkilap. Tak Hanya Bersih, Ban dan Velg Yang Terawat Dapat Menambah Usia Pakainya",
        price = "Rp250.000",
        duration = "1 jam",
        benefits = "– Debu dan Lumpur Lenyap\n" +
                "- Noda Berkerak Hilang\n" +
                "– Ban dan Velg Terawat\n",
        "https://images.squarespace-cdn.com/content/v1/5599d29ee4b078c942e25983/1529359290098-HRMF4PTX3F2U6HVZQ5O9/DSC_0547.jpg?format=2500w"
    )
)
