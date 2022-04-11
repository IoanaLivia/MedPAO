# MedPAO Clinic - Advanced Object Oriented Programming Project

## Descriere

  Proiectul implementeaza functionalitatiile necesare interactiunii cu baza de date a unei clinici, sub aspectul unui UI. Userul se poate inregistra - la alegere -
  drept *Client*, *Medic*, *Cardiolog*, *Oncolog* sau *Administrator*. In lipsa inregistrarii, poate opta pentru alte functionalitati ale meniului principal. Odata inregistrat, acesta este directionat catre un nou meniu care contine si optiunea de logout - are drept efect revenirea la meniul principal.
  
## How To
    
  Format isi propuna sa fie cat mai intuitiv prin aspectul de UI. Inclusiv mesajul initial sugereaza consultarea sectiunii **Help** - poate fi
  din meniul principal. Si in cadrul acesteia se regasesc informatii explicite despre functionalitati, obiecte, mod de utilizare, atentionari, etc. 
  In plus, pentru a usura testarea programului, se poate opta pentru inserarea unor valori predefinite la inceput. Mesajul initial contine o interogare care face referinta la aceste date drept un *demo database*. Prin tastarea 'Yes', valorile vor fi inserate si vom putea face teste cu ajutorul acestora. Vom avea inca optiunea de a insera date. Prin tastarea 'No' drept raspuns la interogarea initiala, testele vor putea fi realizate doar pe datele pe care le vom introduce pe parcursul sesiunii. Alegerea initiala este ireversibila. **Recomandare:** Selectati **Yes** la fiecare inceput de sesiune.

  
## Tipuri de Obiecte & Functionalitati
  
  
  Obiectele utilizate se impart in mai multe categorii si subcategorii. Cele principale sunt entitatile: *Client*, *Medic*, *Administrator*, *Cardiolog*, *Oncolog*, *Appointment*,
  *Afectiune*, *Review*. Prin intermediul acestora sunt implementate functionalitatile. Majoritatea implica procesul de register/login in urma caruia userul este redirectionat catre un submeniu ale carui functionalitati depind de rolul ales. Exceptia face cazul pentru creearea si vizualizarea reviewurilor: aceste operatii sunt disponibile in meniul principal.
  
  * **Client**: create/cancel appointments
  
  * **Medic**: create/cancel appointments + view Client/App records
  
  * **Cardiolog/Oncolog**: view Client/App records
  
  * **Administrator**: view (multiple options for sorting criteria) / check if exists / edit (add/remove)  Client/Medic/Cardiolog/Oncolog/Appointments/Afectiune/Admin
  
  * **Meniu Principal**: Register / Login / MedPAO's story / Our team / Conditions we're treating / Reviews / Leave a Review / New Appointment without registration / 
  Help section

  ## Notiuni utilizate

  * Mostenire 

  * Clasa de Serviciu

  * Interfete

  * Clasa abstracta

  * Enum 
  
  * Comparatori

  * Array

  * ArrayList

  * Set

  ## To be Implemented

  Sectiunea poate fi accesata din meniul principal, contine idei pentru imbunatatiri, aditii & fixes. Printre fixes se numara transpunerea codului complet in limba engleza.

  ## Mentiuni

  Inputul trebuie introdus strict in formatul cerut. Doar varianta **Yes** este valida, yes / y / YES / yEs nu sunt.

