```toml
name = 'Update category'
method = 'PUT'
url = '{{baseUrl}}/categories/category/{id}/update'
sortWeight = 4000000
id = '08e3602e-04b9-4007-8b12-cf6e4c4bf72b'

[[pathVariables]]
key = 'id'
value = '3'

[body]
type = 'JSON'
raw = '''
{
  "name": "Electrics c"
}'''
```
