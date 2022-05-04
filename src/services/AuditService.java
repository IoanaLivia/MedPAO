package services;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class AuditService {
    FileWriter w;

    public AuditService(){
        try {
            this.w = new FileWriter("src/files/Audit.csv", true);
            w.append("Action");
            w.append(" ");
            w.append("Time");
            w.append("\n");
        }
        catch (Exception e)
        {
            System.out.print(e.getMessage());
        }
    }

    public void writeActionToFile(String s) throws IOException {
        if (w != null){
            w.append(s);
            w.append(",");
            w.append(LocalDateTime.now().toString());
            w.append("\n");
            w.flush();
        }
    }
}