/* Project: CUS1156_Lab2
 * Class: UniqueWords.java
 * Author: Dr. Puya Ghazizadeh
 * Modified by: Jann Ethan Yambao
 * Date: September 30, 2024
 * This program counts the number of unique strings in an ArrayList of strings.
 */

import java.util.ArrayList;

public class UniqueWords
{
   /**
    * Counts the number of unique strings in a list
    * @param list ArrayList of strings to be examined
    * @return number of unique strings in the list
    */
   public static int countUnique(ArrayList<String> list)
   {
      int count = 0; 
      ArrayList<String> uniqueList = new ArrayList<>(); 

      
      for (int i = 0; i < list.size(); i++)
      {
         String currentWord = list.get(i);
         boolean isUnique = true; // Flag to check if the current word is unique

         
         for (int j = 0; j < uniqueList.size(); j++)
         {
            if (uniqueList.get(j).equals(currentWord))
            {
               isUnique = false; // Found a duplicate
               break;
            }
         }

         // If the word is unique, add it to the uniqueList
         if (isUnique)
         {
            uniqueList.add(currentWord);
            count++;
         }
      }

      return count; 
   }

   public static void main(String[] args)
   {
      ArrayList<String> words = new ArrayList<>();
      words.add("apple");
      words.add("orange");
      words.add("blackboard");
      words.add("apple");
      words.add("orange");
      words.add("sun");
      words.add("moon");

      int unique = countUnique(words);
      System.out.println(words + " has " + unique + " unique words");
   }
}
