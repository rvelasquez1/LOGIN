public class Main {
    Estudiante Rene=new Estudiante("Rene","velasquez","Claure","14037314","","Ticti Norte","77485166","7935301","raizoreve@gmail.com");
    Docente Javier=new Docente("Javier","Velarde","");
    Persona[]personas={Rene,Javier};
    Usuario[]usuarios={Rene,Javier};
    Persona persona1 = Rene;
    Persona persona2 = Javier;
    Usuario usuario1 = Rene;
    Usuario usuario2 = Javier;

    Estudiante estudiante1 = (Estudiante) persona1;
    Estudiante estudiante2 = (Estudiante) persona2;

}
