```toml
name = 'Get products by category'
method = 'GET'
url = '{{baseUrl}}/products/product/{category}/all/products'
sortWeight = 2968750
id = '643a4f7f-74ec-4acc-b387-7d6406a5968c'

[[pathVariables]]
key = 'category'
value = 'Electronics'

[body]
type = 'JSON'
raw = '''
{
  
}'''
```
