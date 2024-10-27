```toml
name = 'Get products by category'
method = 'GET'
url = '{{baseUrl}}/products/products/by/brand-and-name?brandName=SampleBrand&productName=SampleProduct '
sortWeight = 2750000
id = '95193abb-6ab7-489c-a67f-24ce54642ec6'

[[queryParams]]
key = 'brandName'
value = 'SampleBrand'

[[queryParams]]
key = 'productName'
value = 'SampleProduct '

[body]
type = 'JSON'
raw = '''
{
  
}'''
```
