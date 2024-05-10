function App() {

  console.log("^^^")
  console.log(process.env.REACT_APP_SERVER)
  return (
    <div >            
      address~~ = [{process.env.REACT_APP_SERVER}]
    </div>
  );
}

export default App;
