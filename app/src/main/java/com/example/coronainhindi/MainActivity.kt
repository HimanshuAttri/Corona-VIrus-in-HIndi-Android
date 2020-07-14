package com.example.coronainhindi

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.google.android.gms.ads.MobileAds

class MainActivity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        MobileAds.initialize(this) {}








        setTitle("कोरोना वायरस हिंदी में..\n")
        val url: String = "https://gisanddata.maps.arcgis.com/apps/opsdashboard/index.html#/bda7594740fd40299423467b48e9ecf6"
        //WebView wv = (WebView)
        // val myWebView: WebView = findViewById(R.id.whohi)

        val who: Button = findViewById(R.id.whohi)
        val news: Button = findViewById(R.id.gnhi)
        val moh: Button = findViewById(R.id.mohhi)
        val map: Button = findViewById(R.id.map)
        val qa: Button = findViewById(R.id.qa)
        val stats: Button = findViewById(R.id.stats)
        val imu: Button = findViewById(R.id.imu)
        val info: Button = findViewById(R.id.info)
        val delg: Button = findViewById(R.id.delg)
        val sym: Button = findViewById(R.id.sym)
        val brg: Button = findViewById(R.id.brg)
        val mpg: Button = findViewById(R.id.mpg)
        val upg: Button = findViewById(R.id.upg)
        var call: Button = findViewById(R.id.call)
        var ent : Button = findViewById(R.id.ent)
        val test: Button = findViewById(R.id.test)
        val inst : Button = findViewById(R.id.inst)
        val gnhi : Button = findViewById(R.id.gnhi)
        val app: Button = findViewById(R.id.app)
         val dosd : Button = findViewById(R.id.dosd)
     //   val about : Button = findViewById(R.id.about)
        inst.setOnClickListener(View.OnClickListener {

            val webActivity  = Intent(this, About::class.java)
            webActivity.putExtra("link", "https://translate.google.com/translate?hl=&sl=en&tl=hi&u=https%3A%2F%2Fwww.ayush.gov.in%2F")
            webActivity.putExtra("title",inst.text)
            startActivity(webActivity)
        })


        dosd.setOnClickListener(View.OnClickListener {

            val webActivity  = Intent(this, DosAndDonts::class.java)
            webActivity.putExtra("link", "https://translate.google.com/translate?hl=&sl=en&tl=hi&u=https%3A%2F%2Fwww.ayush.gov.in%2F")
            webActivity.putExtra("title",dosd.text)
            startActivity(webActivity)
        })





        who.setOnClickListener(View.OnClickListener {

            val webActivity  = Intent(this, WebActivity::class.java)
            webActivity.putExtra("link", "https://translate.google.com/translate?hl=&sl=en&tl=hi&u=https%3A%2F%2Fwww.ayush.gov.in%2F")
            webActivity.putExtra("title",who.text)
            startActivity(webActivity)
        })

        moh.setOnClickListener(View.OnClickListener {


            val webActivity  = Intent(this, WebActivity::class.java)
            webActivity.putExtra("link", "https://translate.google.com/translate?hl=&sl=en&tl=hi&u=https%3A%2F%2Fwww.who.int%2Femergencies%2Fdiseases%2Fnovel-coronavirus-2019%2Fadvice-for-public")
            webActivity.putExtra("title",moh.text)
            startActivity(webActivity)


        })
        gnhi.setOnClickListener(View.OnClickListener {

            val webActivity  = Intent(this, WebActivity::class.java)
            webActivity.putExtra("link", "https://news.google.com/topics/CAAqIQgKIhtDQkFTRGdvSUwyMHZNRE55YXpBU0FtaHBLQUFQAQ?hl=hi&gl=IN&ceid=IN%3Ahi")
            webActivity.putExtra("title",gnhi.text)
            startActivity(webActivity)
        })
        map.setOnClickListener(View.OnClickListener {


            val webActivity  = Intent(this, WebActivity::class.java)
            webActivity.putExtra("link", "https://arosisi.github.io/corona-tracker/")
            webActivity.putExtra("title",map.text)
            startActivity(webActivity)
        })
        qa.setOnClickListener(View.OnClickListener {


            val webActivity  = Intent(this, WebActivity::class.java)
            webActivity.putExtra("link", "https://translate.google.com/translate?hl=&sl=en&tl=hi&u=https%3A%2F%2Fwww.who.int%2Fnews-room%2Fq-a-detail%2Fq-a-coronaviruses/")
            webActivity.putExtra("title",qa.text)
            startActivity(webActivity)
        })
        stats.setOnClickListener(View.OnClickListener {


            val webActivity  = Intent(this, WebActivity::class.java)
            webActivity.putExtra("link", "https://covid19.saurav.tech/")
            webActivity.putExtra("title",stats.text)
            startActivity(webActivity)
        })
        imu.setOnClickListener(View.OnClickListener {


            val webActivity  = Intent(this, WebActivity::class.java)
            webActivity.putExtra("link", "https://translate.google.com/translate?hl=&sl=en&tl=hi&u=https%3A%2F%2Fwww.ayush.gov.in%2F")
            webActivity.putExtra("title",imu.text)
            startActivity(webActivity)
        })
        //.....................................................................
        info.setOnClickListener(View.OnClickListener {


            val webActivity  = Intent(this, WebActivity::class.java)
            webActivity.putExtra("link", "https://hi.wikipedia.org/wiki/%E0%A4%95%E0%A5%8B%E0%A4%B0%E0%A5%8B%E0%A4%A8%E0%A4%BE%E0%A4%B5%E0%A4%BE%E0%A4%AF%E0%A4%B0%E0%A4%B8_%E0%A4%B0%E0%A5%8B%E0%A4%97_2019")
            webActivity.putExtra("title",info.text)
            startActivity(webActivity)
        })

        sym.setOnClickListener(View.OnClickListener {


            val webActivity  = Intent(this, WebActivity::class.java)
            webActivity.putExtra("link", "https://translate.google.com/translate?sl=auto&tl=hi&u=https%3A%2F%2Fwww.nhs.uk%2Fconditions%2Fcoronavirus-covid-19%2Fcheck-if-you-have-coronavirus-symptoms%2F")
            webActivity.putExtra("title",sym.text)
            startActivity(webActivity)
        })

        delg.setOnClickListener(View.OnClickListener {
            val uri = Uri.parse("https://delhi.gov.in/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)


        })

        upg.setOnClickListener(View.OnClickListener {
            val uri = Uri.parse("http://up-health.in/en/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)


        })

        mpg.setOnClickListener(View.OnClickListener {
            val uri = Uri.parse("https://mp.gov.in/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)


        })

        brg.setOnClickListener(View.OnClickListener {
            val uri = Uri.parse("http://gov.bih.nic.in/")
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)



        })

        app.setOnClickListener(View.OnClickListener {
            val uri = Uri.parse("https://play.google.com/store/apps/details?id=nic.goi.aarogyasetu&hl=en_IN")

            startActivity(intent)



        })
        call.setOnClickListener(View.OnClickListener { it: View? ->


            val webActivity  = Intent(this, WebActivity::class.java)
            webActivity.putExtra("link", "https://drive.google.com/viewerng/viewer?embedded=true&url="+"https://www.mohfw.gov.in/pdf/coronvavirushelplinenumber.pdf")
            webActivity.putExtra("title",call.text)
            startActivity(webActivity)

        })

        ent.setOnClickListener(View.OnClickListener {


            val webActivity  = Intent(this, WebActivity::class.java)
            webActivity.putExtra("link", "https://games.famobi.com/")
            webActivity.putExtra("title",ent.text)
            startActivity(webActivity)

        })
        test.setOnClickListener(View.OnClickListener {

            val webActivity  = Intent(this, WebActivity::class.java)
            webActivity.putExtra("link", "https://docs.google.com/forms/d/e/1FAIpQLScN7qkg08ZTFxZrMwvS_9cRQHOQfTdLJCnHldlCagDsZ9s8kA/viewform?usp=sf_link")
            webActivity.putExtra("title","कोरोना वायरस हिंदी में..\n")
            startActivity(webActivity)
        })





    }
}
