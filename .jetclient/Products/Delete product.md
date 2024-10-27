```toml
name = 'Delete product'
method = 'DELETE'
url = '{{baseUrl}}/products/product/{productId}/delete'
sortWeight = 5000000
id = '7b6efa22-2e4a-4375-9964-f6df528477ec'

[[pathVariables]]
key = 'productId'
value = '1'

[body]
type = 'JSON'
```
