#### Navn: Magnus Albeck Klitmose

# Shooting
A woman fired a shot at a man with her gun, but the man did not die. List
the possible reasons for the man not dying.

#### Liste af grunde

* Blev ikke skudt i et vitalt sted
* Defekt i pistolen
* Kvinden ramte ved siden af (manglende kontrol at pistolen)
* Manden nåede at få læge hjælp, inden han kom i kritisk tilstand
* Kviden skød med blanke skudt
* Manden kunne havde skudsikker vest på

# Alien
An alien meets you and it asks you to teach it how to brush its teeth. Assume
that the alien has teeth exactly like yours, and is as smart as you, but it
needs a clear step-by-step instruction. List the steps. Be as detailed as
you can. (Example: Hold the toothpaste with your left hand; turn the cap
anti-clockwise)

#### Forklaringen 
Man tager tandpastatuben i venstre hånd, derefter bruges højre hånd til at tage fat i toppen af tandpastatuben hvor skruelåget er lokeret. Derefter skrues låget mod uret indtil låge er frakoblet fra tuben. Herefter tages tandbørsten i højrehånd hvorpå tandbørstens, tandbørstes-hoved drejes op af så hårene på tandbørsten stikker opad. Herefter hovedet på tandpastatuben placeres på tandbørsten. Herefter presses der på tuben så tandpastaen kommer ud, imens tandpasta kommer ud føres tandbørste i en lineær bevægelse indtil tandpastahovedet overflade er dækket med tandpasta. 
Tandbørste placeres derefter i venstre side i undermunden hvorpå tandbørstehovedet roteres med uret. Efter en rotation skiften til næste tand indtil sidst tand i undermunden er nået. Derefter skiftets der overflade over til den øverst del af tandenbørste på samme vis, og på sammevise bagpå tænderne. Når undermunden er børste færdig skiftes der til overmunden med samme koncept.
Når tænderne er børste tænder man vandhanen hvorefter tandbørsten skyldes og derefter munden.

# Give your thoughts on TDD

#### the following questions.
* What was positive and good about using TDD?

Man rammer egde cases, som man muligvis ikke havde fået opdagdet hvis man ikke havde lavede test dertil. Dette oplevede jeg selv da jeg skulle sammenligne excepted med return fra functionen, her tilrettede jeg derefter at der max kan være 2 dicimaler.
   
* What was annoying or difficult?

Det tager tid i starten at skulle skrive testene. Der skal bruges tid på at skrive og tænke over hvilken egde case der 
kunne opstå og derefter starte med at kode op imoden den. Det er en længere process at lave en stump kode pga. ekstensiv mange test, men resultat bliver robust.
Udover det ender man med en del overflødig kode pga. rød gul grøn testen, inden man når frem til den forventet kode som kan håndtere mange af testene.

* What surprised you?

Man tænker mere over hvad for nogen ting der kan opstå i ens kode. Der kommer nogen cases hvor man forventet et simplet resultalt men der kan være en lille ændring f.eks. i dicimal, her fanger testen der med det samme
og man har mulighed for at tilrette noget man måske kunne havde glemt hvis man ikke brugte TDD.

* Did TDD help you write some tests you wouldn’t otherwise have thought
of?

Jeg tænkt mere over hvad for nogen egde cases og hvad for nogen valg af test jeg har skrevet. f.eks høje minus grader som måske ikke vil blive brugt så tit i function men er en vigtigt test for at se om function giver et korrekt return værdi
