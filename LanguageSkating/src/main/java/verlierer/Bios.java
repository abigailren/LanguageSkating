package verlierer;


public class Bios {

    public String[] words = new String[]{"Hello", "Goodbye", "Yes",
            "No", "Thanks", "Good", "Bad", "Not", "Happy",
            "Sad", "Who", "What", "When", "Where", "Why", "How"};

    public String[] spanishWords = new String[]{"Hola", "Adios", "Si",
            "No", "Gracias", "Bueno/a", "Malo/a", "No", "contento/a",
            "triste", "Quien", "Que", "Cuando", "Donde", "Por Que", "Como"};

    public String japanBio = "Japan McJapanFace, who is currently considered one of the top skaters \n"
            + "in the senior division, is the reigning Olympic gold champion and \n"
            + "is looking to be the first male skater in decades to win  consecutive \n"
            + "gold. Currently in his prime years in name in the history of skating \n"
            + "before he reaches the end of his peak as a top figure skater and is \n"
            + "entering the competition with high expectations.";
    /*
            + "Personality: Basically a smug bastard who’s not super in your face  \n"
            + "about his accomplishments but won’t fail to remind you that he’s  \n"
            + "better at skating than you. Super carefree, friendly, cheerful,  \n"
            + "and confident abouthis abilities and acts like he doesn’t have  \n"
            + "a single worry in the world and likes to poke fun of his fellow \n"
            + "skaters. Has a super professional skating persona, magically \n"
            + "transforms into a calm and beautiful skater on the ice with \n"
            + "extremely elegant and soothing performances and treats his \n"
            + "fans and the press in a way that makes him look humble, composed  \n"
            + "and considerate which makes him a douche to other skaters because   \n"
            + "they sometimes look bad if they don’t like Japan even though he \n"
            + "treats them completely differently from how he treats the general public. \n";*/

    public String spainBio = "Spain McSpainFace is the clear underdog of the skating community, "
            + "who shot\nto fame by winning last year's worlds"
            + "surprising everyone and becoming the\nfirst Spanish ice skater to do so."
            + "Will he also bring Spain their first\nOlympic Gold medal in men’s skating, "
            + "or will he crumble under the astounding\npressure that only the Olympic games"
            + "can bring? Either way, he is the fan\nfavorite this year.\n";

    public String chinaBio = "China McChinaFace, who won his first worlds this year at just 16, " +
            "is looking\nto repeat his stellar performance last year and take the a medal again this\nyear. " +
            "There was a scary moment about a month back when an ankle injury\nthreatened to keep him from " +
            "the Olympic games, but he has persevered and\nshows no hesitation in his warmups here tonight.";
    /*
            "Personality: A small ball\nof fluff that is doing his best to act serious and grumpy to get " +
            "taken\nseriously but rarely ever is because people can generally see through him.\nReally " +
            "loves having fun in reality and gets anxious about the expectations\non him and thinks no " +
            "one sees him as a real adult competitor. Probably kinda\nscared of Germany and maybe " +
            "idolized Japan before entering the senior division\nand now doesn’t know if he should be " +
            "glad that Japan’s treating him as his\ncompetitor or if he should be pissed that Japan’s " +
            "always making fun of him.\nOverall just really wants to do his best and prove himself to " +
            "the world and\nhis peers but also scared of failing and making a fool out of himself.\n" +
            "He’s a lot more confident on the ice and tends to have fun, charming skating\npersona " +
            "because he forgets about his worries and just really loves skating??\n";*/

    public String germanyBio = "Among this year's top contenders is German McGermanFace, " +
            "a three-time olympic\nsilver winner, who is competing once again against Japan McJapanFace, " +
            "who beat\nhim for gold in the last Winter Olympics. Whilst he may not have any olympic\n" +
            "golds and is the oldest on the rink, McGermanFace has won more gold medals in\nthe worlds " +
            "than the others combined, due to his 5 year gold streak in his early\n20’s, still leaving " +
            "him amongst the top skaters in the world. However, with this\nbeing his 4th Olympics and " +
            "him rapidly approaching his 30’s, this would seem to\nbe his last chance at that olympic " +
            "gold he’s never quite achieved.\n";



    public String getBio(String s){
        if (s.equals("germany")){
            return germanyBio;
        }
        else if (s.equals("japan")){
            return japanBio;
        }
        else if (s.equals("china")){
            return chinaBio;
        }
        else if (s.equals("spain")){
            return spainBio;
        }
        else
            return "Nothing";
    }
/*
    public static void main(String[] args)  {


        System.out.println(spanishWords[0]);
        System.out.println(words[6]);
        System.out.println(japanBio);
        System.out.println(spainBio);
        System.out.println(chinaBio);
        System.out.println(germanyBio);


    }*/


}
