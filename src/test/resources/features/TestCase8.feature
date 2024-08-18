Feature:Verify All Products and product detail page

  @ab
  Scenario: Verify All Products and product detail page

    * Navigate to "url"
    * Verify that home page is visible successfully
    * Click on ' Products' button
    * Verify user is navigated to "ALL_PRODUCTS" page successfully
    * The products list is visible
    * Click on View Product of first product
    * User is landed to product detail page
    * Verify that detail detail is visible: "product name" "category, price" "availability" "condition" "brand"