```toml
name = 'Count Products by Brand and Name'
method = 'GET'
url = '{{baseUrl}}/products/product/count/by-brand/and-name?brand=SampleBrand&name=SampleProduct'
sortWeight = 2996093
id = 'e23f5685-6d33-47f3-8608-328d2f4f6af1'

[[queryParams]]
key = 'brand'
value = 'SampleBrand'

[[queryParams]]
key = 'name'
value = 'SampleProduct'

[body]
type = 'JSON'
raw = '''
{
  
}'''
```
