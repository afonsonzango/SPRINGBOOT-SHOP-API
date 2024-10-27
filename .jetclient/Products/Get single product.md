```toml
name = 'Get single product'
method = 'GET'
url = '{{baseUrl}}/products/product/{productId}/product'
sortWeight = 2000000
id = 'a25b3179-8d42-41ff-b356-84a5b53a05b4'

[[pathVariables]]
key = 'productId'
value = '1'

[body]
type = 'JSON'
raw = '''
{
  
}'''
```
