```toml
name = 'Update item in cart'
method = 'PUT'
url = '{{baseUrl}}/cartItems/cart/{cartId}/item/{itemId}/update?quantity=12'
sortWeight = 2000000
id = 'b5013eb6-3c7b-4ff0-b3f8-6dca8346c73a'

[[queryParams]]
key = 'quantity'
value = '12'

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
