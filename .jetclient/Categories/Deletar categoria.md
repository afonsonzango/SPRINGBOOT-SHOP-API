```toml
name = 'Deletar categoria'
method = 'DELETE'
url = '{{baseUrl}}/categories/category/{id}/delete'
sortWeight = 3000000
id = 'feee73e9-a643-48d1-842f-75c34b139e22'

[[pathVariables]]
key = 'id'
value = '1'

[body]
type = 'JSON'
raw = '''
{
  "name": "Computadores"
}'''
```
