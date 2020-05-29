package net.dark.game;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class WriteJsonToFileInJava {
    // @SuppressWarnings("unckecked")
    static void methodWriteJSONtoFileInJava(){
        // 1 Sign is aquarius
        JSONObject signAquariusDetails = new JSONObject();
        signAquariusDetails.put("sign","Aquarius");
        signAquariusDetails.put("date_range","01.20 - 02.18");
        signAquariusDetails.put("information","AQUARIUS\n" +
                "Element: Air Strengths: Progressive, original, independent, humanitarian Weaknesses: Runs from emotional expression, temperamental, uncompromising, aloof\n" +
                "Aquarius likes: Fun with friends, helping others, fighting for causes, intellectual conversation, a good listener\n" +
                "Aquarius dislikes: Limitations, broken promises, being lonely, dull or boring situations, people who disagree with them\n" +
                "Aquarius-born are shy and quiet , but on the other hand they can be eccentric and energetic.\n" +
                "However, in both cases, they are deep thinkers and highly intellectual people who love helping others.\n" +
                "They are able to see without prejudice, on both sides, which makes them people who can easily solve problems. Although they can easily adapt to the energy that surrounds them, Aquarius-born have a deep need to be some time alone and away from everything, in order to restore power.\n" +
                "People born under the Aquarius sign, look at the world as a place full of possibilities.\n" +
                "Aquarius is an air sign, and as such, uses his mind at every opportunity. If there is no mental stimulation, they are bored and lack a motivation to achieve the best result.\n" +
                "The ruling planet of Aquarius, Uranus has a timid, abrupt and sometimes aggressive nature, but it also gives Aquarius visionary quality.");

        JSONObject singAquariusObject = new JSONObject();
        singAquariusObject.put("zodiac",signAquariusDetails);

        // 2 Sign is pisces
        JSONObject singPiscesDetails= new JSONObject();
        singPiscesDetails.put("sign","Pisces");
        singPiscesDetails.put("date_range","02.19 - 03.20");
        singPiscesDetails.put("information","PISCES\n" +
                "Element: Water/Strengths: Compassionate, artistic, intuitive, gentle, wise, musical. Weaknesses: Fearful, overly trusting, sad, desire to escape reality, can be a victim or a martyr\n" +
                "Pisces likes: Being alone, sleeping, music, romance, visual media, swimming, spiritual themes\n" +
                "Pisces dislikes: Know-it-all, being criticized, the past coming back to haunt, cruelty of any kind\n" +
                "Pisces are very friendly, so they often find themselves in a company of very different people. Pisces are selfless, they are always willing to help others, without hoping to get anything back.\n" +
                "Pisces is a Water sign and as such this zodiac sign is characterized by empathy and expressed emotional capacity.\n" +
                "Their ruling planet is Neptune, so Pisces are more intuitive than others and have an artistic talent. Neptune is connected to music, so Pisces reveal music preferences in the earliest stages of life. They are generous, compassionate and extremely faithful and caring.\n" +
                "People born under the Pisces sign have an intuitive understanding of the life cycle and thus achieve the best emotional relationship with other beings.\n" +
                "Pisces-born are known by their wisdom, but under the influence of Uranus, Pisces sometimes can take the role of a martyr, in order to catch the attention. Pisces are never judgmental and always forgiving. They are also known to be most tolerant of all the zodiac signs.");

        JSONObject signPiscesObject =new JSONObject();
        signPiscesObject.put("zodiac",singPiscesDetails);

        // 3 Sign is aries
        JSONObject signAriesDetails = new JSONObject();
        signAriesDetails.put("sign","Aries");
        signAriesDetails.put("date_range","03.21 - 04.19");
        signAriesDetails.put("information","ARIES\n" +
                "Element: Fire/Strengths: Courageous, determined, confident, enthusiastic, optimistic, honest, passionate Weaknesses: Impatient, moody, short-tempered, impulsive, aggressive\n" +
                "Aries likes: Comfortable clothes, taking on leadership roles, physical challenges, individual sports. Aries dislikes: Inactivity, delays, work that does not use one's talents\n" +
                "As the first sign in the zodiac, the presence of Aries always marks the beginning of something energetic and turbulent. They are continuously looking for dynamic, speed and competition, always being the first in everything - from work to social gatherings. Thanks to its ruling planet Mars and the fact it belongs to the element of Fire (just like Leo and Sagittarius), Aries is one of the most active zodiac signs.\n" +
                "It is in their nature to take action, sometimes before they think about it well.");

        JSONObject signAriesObject = new JSONObject();
        signAriesObject.put("zodiac",signAriesDetails);

        // 4 Sign is taurus
        JSONObject signTaurusDetails = new JSONObject();
        signTaurusDetails.put("sign","Taurus");
        signTaurusDetails.put("date_range"," 04.20 - 05.20");
        signTaurusDetails.put("information","TAURUS\n" +
                "Strengths: Reliable, patient, practical, devoted, responsible, stable\n" +
                "Weaknesses: Stubborn, possessive, uncompromising. Taurus likes: Gardening, cooking, music, romance, high quality clothes, working with hands. Taurus dislikes: Sudden changes, complications, insecurity of any kind, synthetic fabrics\n" +
                "Practical and well-grounded, Taurus is the sign that harvests the fruits of labor. They feel the need to always be surrounded by love and beauty, turned to the material world, hedonism, and physical pleasures. People born with their Sun in Taurus are sensual and tactile, considering touch and taste the most important of all senses.\n" +
                "Stable and conservative, this is one of the most reliable signs of the zodiac, ready to endure and stick to their choices until they reach the point of personal satisfaction.");

        JSONObject signTaurusObject = new JSONObject();
        signTaurusObject.put("zodiac",signTaurusDetails);

        // 5 Sign is gemini
        JSONObject signGeminiDetails = new JSONObject();
        signGeminiDetails.put("sign","Gemini");
        signGeminiDetails.put("date_range"," 05.21 - 06.20 ");
        signGeminiDetails.put("information","GEMINI\n" +
                "Strengths: Gentle, affectionate, curious, adaptable, ability to learn quickly and exchange ideas. Weaknesses: Nervous, inconsistent, indecisive. Gemini likes: Music, books, magazines, chats with nearly anyone, short trips around the town. Gemini dislikes: Being alone, being confined, repetition and routine. \n" +
                "Expressive and quick-witted, Gemini represents two different personalities in one and you will never be sure which one you will face. They are sociable, communicative and ready for fun, with a tendency to suddenly get serious, thoughtful and restless. They are fascinated with the world itself, extremely curious, with a constant feeling that there is not enough time to experience everything they want to see.");

        JSONObject signGeminiObject = new JSONObject();
        signGeminiObject.put("zodiac",signGeminiDetails);

        // 6 Sign is cancer
        JSONObject signCancerDetails = new JSONObject();
        signCancerDetails.put("sign","Cancer");
        signCancerDetails.put("date_range"," 06.21 - 07.22 ");
        signCancerDetails.put("information","CANCER\n" +
                "Strengths: Tenacious, highly imaginative, loyal, emotional, sympathetic, persuasive. Weaknesses: Moody, pessimistic, suspicious, manipulative, insecure. Cancer likes: Art, home-based hobbies, relaxing near or in water, helping loved ones, a good meal with friends\n" +
                "Cancer dislikes: Strangers, any criticism of Mom, revealing of personal life. Deeply intuitive and sentimental, Cancer can be one of the most challenging zodiac signs to get to know. They are very emotional and sensitive, and care deeply about matters of the family and their home. Cancer is sympathetic and attached to people they keep close. Those born with their Sun in Cancer are very loyal and able to empathize with other people's pain and suffering.");

        JSONObject signCancerObject = new JSONObject();
        signCancerObject.put("zodiac",signCancerDetails);

        // 7 Sign is leo
        JSONObject signLeoDetails = new JSONObject();
        signLeoDetails.put("sign","Leo");
        signLeoDetails.put("date_range"," 07.23 - 08.22 ");
        signLeoDetails.put("information","LEO \n" +
                "  Strengths: Creative, passionate, generous, warm-hearted, cheerful, humorous. Weaknesses: Arrogant, stubborn, self-centered, lazy, inflexible. Leo likes: Theater, taking holidays, being admired, expensive things, bright colors, fun with friends. Leo dislikes: Being ignored, facing difficult reality, not being treated like a king or queen\n" +
                "People born under the sign of Leo are natural born leaders. They are dramatic, creative, self-confident, dominant and extremely difficult to resist, able to achieve anything they want to in any area of life they commit to. There is a specific strength to a Leo and their \"king of the jungle\" status. Leo often has many friends for they are generous and loyal. Self-confident and attractive, this is a Sun sign capable of uniting different groups of people and leading them as one towards a shared cause, and their healthy sense of humor makes collaboration with other people even easier." );

        JSONObject signLeoObject = new JSONObject();
        signLeoObject.put("zodiac",signLeoDetails);

        // 8 Sign is virgo
        JSONObject signVirgoDetails = new JSONObject();
        signVirgoDetails.put("sign","Virgo");
        signVirgoDetails.put("date_range","08.23 – 09.22 ");
        signVirgoDetails.put("information","VIRGO\n" +
                "Strengths: Loyal, analytical, kind, hardworking, practical. Weaknesses: Shyness, worry, overly critical of self and others, all work and no play. Virgo likes: Animals, healthy food, books, nature, cleanliness.Virgo dislikes: Rudeness, asking for help, taking center stage\n" +
                "Virgos are always paying attention to the smallest details and their deep sense of humanity makes them one of the most careful signs of the zodiac. Their methodical approach to life ensures that nothing is left to chance, and although they are often tender, their heart might be closed for the outer world. This is a sign often misunderstood, not because they lack the ability to express, but because they won’t accept their feelings as valid, true, or even relevant when opposed to reason.\n" +
                "The symbolism behind the name speaks well of their nature, born with a feeling they are experiencing everything for the first time.");

        JSONObject signVirgoObject = new JSONObject();
        signVirgoObject.put("zodiac",signVirgoDetails);

        // 9 Sign is libra
        JSONObject signLibraDetails = new JSONObject();
        signLibraDetails.put("sign","Libra");
        signLibraDetails.put("date_range","09.23 - 10.22 ");
        signLibraDetails.put("information","LIBRA \n" +
                "Strengths: Cooperative,diplomatic, gracious, fair-minded, social. Weaknesses: Indecisive, avoids confrontations, will carry a grudge, self-pity. Libra likes: Harmony, gentleness, sharing with others, the outdoors.Libra dislikes: Violence, injustice, loudmouths, conformity\n" +
                "People born under the sign of Libra are peaceful, fair, and they hate being alone. Partnership is very important for them, as their mirror and someone giving them the ability to be the mirror themselves. These individuals are fascinated by balance and symmetry, they are in a constant chase for justice and equality, realizing through life that the only thing that should be truly important to themselves in their own inner core of personality. This is someone ready to do nearly anything to avoid conflict, keeping the peace whenever possible ");

        JSONObject signLibraObject = new JSONObject();
        signLibraObject.put("zodiac",signLibraDetails);

        // 10 Sign is scorpio
        JSONObject signScorpioDetails = new JSONObject();
        signScorpioDetails.put("sign","Scorpio");
        signScorpioDetails.put("date_range","10.23 - 11.21 ");
        signScorpioDetails.put("information","SCORPIO \n" +
                "Strengths: Resourceful, brave, passionate, stubborn, a true friend. Weaknesses: Distrusting, jealous, secretive, violent. Scorpio likes: Truth, facts, being right, longtime friends, teasing, a grand passion. Scorpio dislikes: Dishonesty, revealing secrets, passive people. Scorpio-born are passionate and assertive people. They are determined and decisive, and will research until they find out the truth. Scorpio is a great leader, always aware of the situation and also features prominently in resourcefulness.\n" +
                "Scorpio is a Water sign and lives to experience and express emotions. Although emotions are very important for Scorpio, they manifest them differently than other water signs. In any case, you can be sure that the Scorpio will keep your secrets, whatever they may be.");

        JSONObject signScorpioObject = new JSONObject();
        signScorpioObject.put("zodiac",signScorpioDetails);

        // 11 Sign is sagittarius
        JSONObject signSagittariusDetails = new JSONObject();
        signSagittariusDetails.put("sign","Sagittarius");
        signSagittariusDetails.put("date_range"," 11.22 - 12.21  ");
        signSagittariusDetails.put("information","SAGITTARIUS \n" +
                "Strengths: Generous, idealistic, great sense of humor. Weaknesses: Promises more than can deliver, very impatient, will say anything no matter how undiplomatic.Sagittarius likes: Freedom, travel, philosophy, being outdoors\n" +
                "Sagittarius dislikes: Clingy people, being constrained, off-the-wall theories, details. Curious and energetic, Sagittarius is one of the biggest travelers among all zodiac signs. Their open mind and philosophical view motivates them to wander around the world in search of the meaning of life. Sagittarius is extrovert, optimistic and enthusiastic, and likes changes. Sagittarius-born are able to transform their thoughts into concrete actions and they will do anything to achieve their goals. ");

        JSONObject signSagittariusObject = new JSONObject();
        signSagittariusObject.put("zodiac",signSagittariusDetails);

        // 12 Sign is capricorn
        JSONObject signCapricornDetails = new JSONObject();
        signCapricornDetails.put("sign","Capricorn");
        signCapricornDetails.put("date_range"," 12.22 - 12.31 ");
        signCapricornDetails.put("information","CAPRICORN \n" +
                "Strengths: Responsible, disciplined, self-control, good managers. Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst. Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
                "Capricorn dislikes: Almost everything at some point. Capricorn is a sign that represents time and responsibility, and its representatives are traditional and often very serious by nature. These individuals possess an inner state of independence that enables significant progress both in their personal and professional lives. They are masters of self-control and have the ability to lead the way, make solid and realistic plans, and manage many people who work for them at any time. They will learn from their mistakes and get to the top based solely on their experience and expertise. ");

        JSONObject signCapricornObject = new JSONObject();
        signCapricornObject.put("zodiac",signCapricornDetails);

        // 13 Sign is capricorns
        JSONObject signCapricornsDetails = new JSONObject();
        signCapricornsDetails.put("sign","Capricorns");
        signCapricornsDetails.put("date_range"," 01.01 - 01.19  ");
        signCapricornsDetails.put("information","Strengths: Responsible, disciplined, self-control, good managers. Weaknesses: Know-it-all, unforgiving, condescending, expecting the worst. Capricorn likes: Family, tradition, music, understated status, quality craftsmanship\n" +
                "Capricorn dislikes: Almost everything at some point. Capricorn is a sign that represents time and responsibility, and its representatives are traditional and often very serious by nature. These individuals possess an inner state of independence that enables significant progress both in their personal and professional lives. They are masters of self-control and have the ability to lead the way, make solid and realistic plans, and manage many people who work for them at any time. They will learn from their mistakes and get to the top based solely on their experience and expertise.");

        JSONObject signCapricornsObject = new JSONObject();
        signCapricornsObject.put("zodiac",signCapricornsDetails);

        // Add all signs_Object to list
        JSONArray signsList = new JSONArray();
        signsList.add(singAquariusObject);
        signsList.add(signPiscesObject);
        signsList.add(signAriesObject);
        signsList.add(signTaurusObject);
        signsList.add(signGeminiObject);
        signsList.add(signCancerObject);
        signsList.add(signLeoObject);
        signsList.add(signVirgoObject);
        signsList.add(signLibraObject);
        signsList.add(signScorpioObject);
        signsList.add(signSagittariusObject);
        signsList.add(signCapricornObject);
        signsList.add(signCapricornsObject);

        try {
            FileWriter fileWriter = new FileWriter("ZODIAC SIGNS.json");

            fileWriter.write(signsList.toJSONString());
            fileWriter.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
