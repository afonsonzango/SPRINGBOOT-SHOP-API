```toml
name = 'Add item to cart'
method = 'POST'
url = '{{baseUrl}}/cartItems/item/add'
sortWeight = 1000000
id = '1547bebf-88be-4197-a4a1-7d6b02b32c04'

[body]
type = 'JSON'
raw = '''
{
  "productId": 1,
  "quantity": 12
}'''
```
