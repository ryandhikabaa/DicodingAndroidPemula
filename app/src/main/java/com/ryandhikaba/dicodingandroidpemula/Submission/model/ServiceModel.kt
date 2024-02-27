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
        name = "Exterior Revive",
        description = "Paket Exterior Revive akan memperindah penampilan luar mobil Anda. Layanan ini mencakup pencucian eksterior menyeluruh, poles, dan aplikasi pelindung untuk cat mobil Anda. Kami akan meningkatkan kilau dan melindungi cat mobil Anda dari kerusakan.",
        price = "Rp350.000",
        duration = "3 jam",
        benefits = "- Penampilan luar mobil yang memukau\n- Perlindungan cat yang kuat\n- Melindungi cat dari kerusakan",
        "https://d1hv7ee95zft1i.cloudfront.net/custom/blog-post/mobile/featured/10-cheap-ways-to-detail-your-car-like-a-pro-6103daf03f157.jpg"
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
    )
)
