package ex4;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Classe utilitaire pour le formatage des dates.
 */
public class DateUtils {

    /**
     * Modèle de format par défaut.
     */
    private static final String DEFAULT_PATTERN = "dd/MM/yyyy HH:mm:ss";

    /**
     * Formate une date selon le modèle spécifié.
     *
     * @param pattern Modèle de formatage. Si vide ou null, utilise le modèle par défaut.
     * @param date    Date à formater.
     * @return Chaîne formatée représentant la date.
     */
    public static String format(String pattern, Date date) {
        pattern = pattern.trim().isEmpty() ? DEFAULT_PATTERN : pattern;
        SimpleDateFormat formateur = new SimpleDateFormat(pattern);
        return formateur.format(date);
    }
}
