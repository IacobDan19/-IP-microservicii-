# -IP-microservicii-
De la linia de comanda se introduce o zi a saptamanii (Luni ,Marti ,...,Vineri),este tratat cazul in care se introduce un alt format.
Pe baza string-ului introdus si a orei luata de la ora sistemului se va returna numarul celui mai apropiat autobuz ce mai are locuri disponibile iar
 cientul va primi un bilet la acel autobuz in ziua specificata sau mesajul "incearca pt ziua urmatoare".  
Chiar daca este ora 11:59 clientul va primi bilet la ora 12 daca sunt locuri in ziua respectiva.
Daca ora sistemului este 10:15 atunci functia calendar.get(Calendar.HOUR_OF_DAY) va returna ora 10;
Daca ora sistemului este 22:15 atunci functia calendar.get(Calendar.HOUR_OF_DAY) va returna ora 22;
Am introdus pt campul nr. de locuri valori mici (2,4)pt a face ca un eventual test sa se faca rapid.
Doar cumpararea unui bilet pt ora 18:25 se face pana in ora 17:59. 
Programul functioneaza doar pt o saptamana .
