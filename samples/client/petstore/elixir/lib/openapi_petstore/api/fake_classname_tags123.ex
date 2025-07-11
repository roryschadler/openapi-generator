# NOTE: This file is auto generated by OpenAPI Generator 7.15.0-SNAPSHOT (https://openapi-generator.tech).
# Do not edit this file manually.

defmodule OpenapiPetstore.Api.FakeClassnameTags123 do
  @moduledoc """
  API calls for all endpoints tagged `FakeClassnameTags123`.
  """

  alias OpenapiPetstore.Connection
  import OpenapiPetstore.RequestBuilder

  @doc """
  To test class name in snake case
  To test class name in snake case

  ### Parameters

  - `connection` (OpenapiPetstore.Connection): Connection to server
  - `client` (Client): client model
  - `opts` (keyword): Optional parameters

  ### Returns

  - `{:ok, OpenapiPetstore.Model.Client.t}` on success
  - `{:error, Tesla.Env.t}` on failure
  """
  @spec test_classname(Tesla.Env.client, OpenapiPetstore.Model.Client.t, keyword()) :: {:ok, OpenapiPetstore.Model.Client.t} | {:error, Tesla.Env.t}
  def test_classname(connection, client, _opts \\ []) do
    request =
      %{}
      |> method(:patch)
      |> url("/fake_classname_test")
      |> add_param(:body, :body, client)
      |> Enum.into([])

    connection
    |> Connection.request(request)
    |> evaluate_response([
      {200, OpenapiPetstore.Model.Client}
    ])
  end
end
