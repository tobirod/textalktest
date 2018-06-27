package com.tobirod.textalktest.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.tobirod.textalktest.R;
import com.tobirod.textalktest.adapters.CustomAdapter;
import com.tobirod.textalktest.models.Article;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    static ArrayList<Article> articleArrayList;
    private CustomAdapter customAdapter;
    private ListView articleListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        articleArrayList = new ArrayList<>();

        articleListView = findViewById(R.id.article_listView);

        setupArticles();
    }

    private void setupArticles() {

        Article a1 = new Article("Steams stora sommarrea är igång!", "steam", "Hög tid att preppa inför eventuellt semesterregn.", "Lika traditionsenligt som att datumen för kommande Steam-reor läcker, har Steams stora sommarrea nu rullat igång. För tredje året i rad börjar rean torsdagen innan midsommarafton, och i väntan på sill, stärkande dryck och dans runt fallna och återuppståndna träd kan fylla backloggen och tömma betalkortet. Så iväg och handla med sig!");
        Article a2 = new Article("Vi kan vinna – genom att bryta mot reglerna", "fotboll", "Så står vi nu här. En match ifrån himmel eller helvete. En match där jag vill se Sverige ta till alla medel, både tillåtna och otillåtna, för att ta VM-drömmen vidare.", "Sträcker jag ut armarna kan jag omfamna minnet av kvällen i Milano i november i fjol efter att Sverige tagit sig till VM; triumfen, lyckan och drömmen som tändes i svenska hjärtan. Drömmen om en stor VM-sommar, om den glädje och berusning i stunden som ett mästerskap ger, den historia som skrivs, de minnen som samlas i hjärtats vackraste vrår. Tolv års lidande och längtan, efter att få vara med igen. En vinter och en vår av förväntan inför VM-sommaren. Nu står Sverige vid helvetesgapets rand, men på andra sidan skimrar åttondelsfinalen. I dag, mot Mexiko, måste alla våga ta språnget och tro på att det bär hela vägen.\n\nJag vill se det Sverige jag såg på Friends Arena och San Siro i playoffen i fjol. Långt ifrån perfekt men skoningslöst, hämningslöst, skrupellöst. Ett Sverige som inte bad om ursäkt en sekund, som spelade med stora hjärtan men också med vassa armbågar, stora munnar, fula ord, rackarknep och lika mycket slughet som mod. Vi förväntade oss inte att vinna med enbart fair play och genom att vara snälla och blåögda, i dubbel bemärkelse.\n\nNu vill jag se Janne Andersson ingjuta samma känsla i spelarna, i detta sanningens ögonblick mot Mexiko. Känslan av att allt är tillåtet, även det otillåtna.\n\nVM hittills har ju handlat mycket om VAR, för mycket. Framtiden är här för att stanna, vi kommer att vänja oss vid videodomar-assistansen, systemet kommer att sätta sig. Det verkligt intressanta är inte allt det domarna nu ser utan det de ännu missar, eller väljer att missa. Som Marcus Bergs uteblivna straff mot Tyskland. De stora nationerna kommer alltid att ha medvind, fotboll på toppnivå är det mest cyniska och pengastinna av alla spel. Då kan man försöka vinna med enbart ärliga medel och få åka hem från Ryssland eller gilla läget, spela med i fulspelet och gå vidare.");
        Article a3 = new Article("REVEALED: THE NEW LEGO® TECHNIC™ BUGATTI CHIRON - WHERE ART, ENGINEERING AND BRICKS COMBINE", "lego", "LEGO Group and Bugatti Automobiles S.A.S. have today revealed the new LEGO® Technic™ Bugatti Chiron. The 1:8 scale super car will be available from June 1. The LEGO® Technic™ Bugatti Chiron model brings together the iconic design heritage of the French ultra-luxury car brand and LEGO Technic™ elements, with a reimagined version of the latest cutting-edge super car from Molsheim.", "The new model was unveiled at LEGO House at the company’s headquarters in Billund by Niels B. Christiansen, CEO of the LEGO Group, and Bugatti President Stephan Winkelmann. The 1:8 scale LEGO® Technic™ Bugatti Chiron will be available from June 1, only at all LEGO® stores and shop.LEGO.com, then all retailers globally from August 1, 2018.\n\nThe model encapsulates the magic, power and elegance of the Chiron, unveiled to the world two years ago and now brought to life in LEGO Technic™ form, offering a unique, authentic building experience for car enthusiasts and LEGO fans of all ages.\n\nNiels B. Christiansen, CEO of the LEGO Group said: “I am very excited about this new model. Our LEGO designers have done an amazing job capturing the details of this iconic Bugatti design. It truly stands as testament that with LEGO bricks you can build anything you can imagine, and an example that with LEGO Technic™, you can build for real. It’s a huge model that I can’t wait to start building myself. I’ve always been passionate about engineering and this model’s details and design are truly fascinating.\n\nStephan Winkelmann, President of Bugatti Automobiles S.A.S.: “Thanks to their proven design and technology expertise, the LEGO Group and Bugatti are the epitomes of their brand segments. The LEGO Technic™ model of the Bugatti Chiron is an expression of this perfect relationship. I am impressed at the precision and refinement with which our super sports car has been translated into the LEGO world and I am sure that fans of both LEGO bricks and Bugatti will love this product.”");
        Article a4 = new Article("Heather Locklear gripen - sparkade polis på benet", "locklear_smash", "”Melrose place”-stjärnan Heather Locklear, 56, greps på söndagen – efter att ha sparkat en polis på benet. När hon skulle genomgå en medicinsk undersökning sparkade hon även en läkare på bröstet. För bara en vecka sedan försökte skådespelaren slå sin pappa och strypa sin mamma.", "Det var under gårdagen som skådespelaren greps sitt hem i Thousand Oaks, Kalifornien, efter att polisen svarat på två larmsamtal. Det första samtalet, som polisen mottog vid sex-tiden på kvällen, rörde ”oroligheter” – men poliserna på plats bedömde att inget brott hade begåtts och lämnade stjärnans hem. Men när poliserna återvände till Heather Locklears hem efter ännu ett samtal vid elva-tiden hade skådespelaren hamnat i bråk med en annan icke namngiven person, uppger polisbefäl Eric Buschow till CNN.\n\nEnligt Buschow ska Heather Locklear sedan ha sparkat en av poliskonstaplarna på benet – och ska enligt befälet ha varit ”extremt berusad och väldigt osamarbetsvillig” när hon greps och fördes till häktet.\n\nMen stjärnans våldsamheter tog inte slut där. Eftersom hon var berusad behövde Locklear genomgå en medicinsk undersökning innan hon skulle sättas bakom galler – och då ska hon ha sparkat en av läkarna på bröstkorgen, uppger polisbefälet till CNN. Skådespelaren fick flyttas till ett närliggande sjukhus, för att sedan skickas vidare till häktet.\n\nFör bara en vecka sedan fick hon föras akut till sjukhus, efter att skådespelarens mamma ringt polisen när hon blivit våldsam – och sedan försökt slå och strypa sina föräldrar. Stjärnan ska också ha hotat med att skada sig själv.\n\nI februari greps hon misstänkt för att ha misshandlat sin dåvarande pojkvän Jack Wagner. När polisen anlände till hennes hem gjorde hon våldsamt motstånd. Under tiden i häktet mordhotade hon poliserna. Hon har även sökt behandling för depression, ångest och missbruk.");
        Article a5 = new Article("Barry Gibb receives knighthood at Buckingham Palace for services to music and charity", "knight_fever", "It was a different kind of knight fever in London tonight when Bee Gees legend Barry Gibb was bestowed with a knighthood.", "Sir Barry received his gong as a Knight Bachelor from Prince Charles at an investiture service at Buckingham Palace, honoured for his services to music and charity.\n\nThe 71-year-old fronted and co-founded one of the world’s most successful pop groups, the Bee Gees, with his brothers, the twins Robin and Maurice, in 1958.\n\nBorn on the Isle of Man, raised in Manchester, the singer-songwriter brothers moved to Australia for a period in the late 1950s and early 1960s, living in Queensland before moving back to the UK and eventually settling in the United States.\n\nTheir hits, sung in their trademark three-part harmony, included some of the defining songs of the disco period including Stayin’ Alive, You Should Be Dancing, Jive Talkin’ and Night Fever.\n\nWith more than 220 million albums sold, the Bee Gees remain one of the most successful bands in the world.");

        articleArrayList.add(a1);
        articleArrayList.add(a2);
        articleArrayList.add(a3);
        articleArrayList.add(a4);
        articleArrayList.add(a5);

        setupRecyclerView();
    }

    private void setupRecyclerView() {
        customAdapter = new CustomAdapter(articleArrayList, this);
        articleListView.setAdapter(customAdapter);
        articleListView.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Log.i("TAG", Integer.toString(i));

                Intent intent = new Intent(getApplicationContext(), TabActivity.class);
                intent.putExtra("Position", i);
                startActivity(intent);
            }
        });
    }
}
