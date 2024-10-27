```toml
name = 'Remove item from cart'
method = 'GET'
url = '{{baseUrl}}/cartItems/cart/{cartId}/item/{itemId}/remove'
sortWeight = 500000
id = '165fd065-f8a4-4aa7-8f33-208bd24f9a67'

[[pathVariables]]
key = 'cartId'
value = '1'

[[pathVariables]]
key = 'itemId'
value = '1'

[body]
type = 'JSON'
raw = '''
{
  "productId": 1,
  "quantity": 12
}'''
```
