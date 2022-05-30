README
##MedPAO Clinic - Advanced Object Oriented Programming Project


###<Descriere>
  Proiectul implementeaza functionalitatiile necesare gestionarii unei clinici. Este impartit in doua medii. Primul poate accesat prin raspunsul 'Yes' la interogarea initiala, ofera acesul catre operatii CRUD efectuate asupra unei baze de date dezvoltata in MySQL Workbench. Daca raspunsul la interogarea pentru accesarea primului mediu este negativ, urmeaza a doua interogarea care prevede un demo database (date importate dintr-un csv). Acest mediu permite
  functionalitati suplimentare, cum ar fi logarea pe baza unei inregistrari precedente drept
  Client / Medic / Cardiolog / Oncolog / Administrator. Fiecare rol beneficiaza de un submeniu
  personalizat. Accesul la modificarea datelor este permis doar administratorilor.
  
  
  
  Asadar, userul se poate inregistra - la alegere - drept Client, Medic, Cardiolog, Oncolog sau Administrator. In lipsa inregistrarii, poate opta pentru alte functionalitati ale meniului principal. Odata inregistrat,
  acesta este directionat catre un nou meniu care contine si optiunea de logout - aceasta are drept efect revenirea la meniul principal.

  
###<How To>  
  Proiectul isi propune sa aiba un format cat mai intuitiv prin aspectul de UI. Mesajul initial are rolul de a ghida, sugerand consultarea sectiunii Help care poate fi
  accesata prin intermediul optiunii din meniul principal. Si in cadrul acesteia se regasesc informatii explicite despre functionalitati, obiecte,
  mod de utilizare, atentionari, etc. 
  In plus, pentru a usura testarea programului, se poate opta pentru inserarea unor valori predefinite la inceput. Mesajul initial contine o interogare care face referinta
  la aceste date drept un "demo database". Prin tastarea 'Yes', valorile vor fi inserate si vom putea face teste cu ajutorul acestora. Vom avea inca optiunea de a insera
  date. Prin tastarea 'No' drept raspuns la interogarea initiala, testele vor putea fi realizate doar pe datele pe care le vom introduce pe parcursul sesiunii. Alegerea 
  este ireversibila.

  
###<Tipuri de Obiecte & Functionalitati>
  Obiectele utilizate se impart in mai multe categorii si subcategorii. Cele principale sunt entitatile: Client, Medic, Administrator, Cardiolog, Oncolog, Appointment,
  Afectiune, Review. Prin intermediul acestora sunt implementate functionalitatile. Majoritatea implica procesul de register/login in urma caruia userul este redirectionat
  catre un submeniu ale carui functionalitati depind de rolul ales. Exceptia face cazul pentru creearea si vizualizarea reviewurilor: aceste operatii sunt disponibile in
  meniul principal.
  
  *Client: create/cancel appointments
  *Medic: create/cancel appointments + view Client/App records
  *Cardiolog/Oncolog: view Client/App records
  *Administrator: view (multiple options for sorting criteria) / check if exists / edit (add/remove)  Client/Medic/Cardiolog/Oncolog/Appointments/Condition(Afectiune)/Administrator
  *Meniu Principal : Register / Login / MedPAO's story / Our team / Conditions we're treating / Reviews / Leave a Review / Make an Appointment without an account / Help section

###<SQL>
   *Create / Drop table
   *Create / Delete instance
   *Update any of the instance's attributes
   *Display all instances
   *Display certain instance

   Pentru Client / Medic / Condition (Afectiune) / Admin