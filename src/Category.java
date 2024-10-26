public class Category 
{
   private static int idCounter = 1;
   int categoryID;
   String categoryName;

   public Category(String categoryName)
   {
    this.categoryID = idCounter++;
    this.categoryName = categoryName;
   }

   // Method to get category details
   public void getCategory()
   {
    System.out.println("Category ID " + categoryID );
    System.out.println("Category Name" + categoryName);
   }

   public String getName()
   {
      return categoryName;
   }


}