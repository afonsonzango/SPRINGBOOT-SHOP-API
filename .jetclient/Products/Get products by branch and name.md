```toml
name = 'Get products by branch and name'
method = 'GET'
url = '{{baseUrl}}/products/products/by/category-and-brand?category=Electronics&brand=SampleBrand'
sortWeight = 2500000
id = '67b6fe05-ee56-4061-809e-2b77e2c1856b'

[[queryParams]]
key = 'category'
value = 'Electronics'

[[queryParams]]
key = 'brand'
value = 'SampleBrand'

[body]
type = 'JSON'
raw = '''
{
  
}'''
```
