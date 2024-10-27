```toml
name = 'Update product'
method = 'PUT'
url = '{{baseUrl}}/products/product/{productId}/update'
sortWeight = 4000000
id = '8a6ca503-314b-4a3d-9365-425432e98bff'

[[pathVariables]]
key = 'productId'
value = '1'

[body]
type = 'JSON'
raw = '''
{
  "name": "Sample Product",
  "brand": "Sample Brand",
  "price": 29.99,
  "inventory": 100,
  "description": "This is a sample product description.",
  "category": {
    "id": 1,
    "name": "Sample Category"
  }
}
'''
```
