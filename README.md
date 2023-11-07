# ABOUT SOLANA:
* Solana is a blockchain platform that aims to provide scalability, speed, and low costs. It utilizes a unique consensus mechanism known as Proof of History (PoH) to achieve high throughput and low latency.
* In the realm of Web 3, Solana strives to offer the foundational framework for decentralized applications that are swift, cost-effective, and capable of processing thousands of transactions per second.


1. # PURPOSE OF SOLANA CONTRACT :
  This Solana NFT contract allows minting, burning and transferring NFT tokens on the Solana blockchain. The contract follows the `SPL Token standard` for NFTs.

2. # solana contract having diverse of  functionalities and various purposes.

   ##About signficance of  mint ,transfer and burn functions as follows as below:
    * Mint: Allows an authorized minter to mint new NFT tokens. The minter is specified during contract initialization.

   * Burn: Allows token owners to burn their own NFT tokens, effectively removing them from circulation.

   * transfer: Allows token owners to transfer their NFT tokens to other wallet addresses.
    
     [These instructions will be implemented relatively easily thanks to CPIs(Cross Programming Invocations). Rather than creating our own functions from scratch, we will define 
      our Gem-specific inputs,  and use those inputs will invoke already existing spl token library functions.]

   * Solana NFT smart contracts allow you to issue, manage, and trade non-fungible tokens on the Solana blockchain. The main purposes and functionalities of a Solana NFT smart 
   contract are:

  * Issue NFTs
   The primary purpose of an NFT smart contract is to allow minters to issue new NFT tokens on the blockchain. The contract defines the standards and rules for minting NFTs, 
    such  as what metadata needs to be provided and any minting limits.

  * store NFT Metadata
  The contract stores the metadata for each NFT, including information like the name, description, image URL, properties, and other traits. This metadata is important for 
  identifying and displaying the NFT to users.

  * Track Ownership
  The contract keeps track of the owner of each NFT token and facilitates ownership transfers. When an NFT is minted, it is assigned an owner. When it is sold or traded, the 
  contract updates the ownership to the new address.

  * Enable Trading
  By facilitating ownership transfers, the contract enables a market for the NFTs to be traded. Users can send NFTs to other wallet addresses, allowing the tokens to change 
   hands.

  * Royalties
  Advanced NFT contracts can implement royalty fees, where a percentage of secondary sales are sent to the original minter or other designated addresses. This allows creators to 
  earn ongoing revenue from their NFTs.

  * Access Control
  The contract can restrict certain functions only to authorized accounts, such as the minter address. This ensures that only certain functions can be performed by trusted 
  parties.

  In summary, a Solana NFT smart contract provides the core functionality for users to issue, own, trade and potentially earn from NFT tokens on the Solana blockchain. The 
   contract defines the standards and rules that all NFT tokens of that collection must abide by.

3. # Testing
 
 * The contract should be tested for many reasons like:

 * valid minting with correct metadata
 * Invalid minting with invalid metadata
 * Transferring NFTs between wallets
 * Burning NFTs owned by the wallet.

4. # How to Deploy the Contract:

 * Before deploying the contract, we need to build a new smart contract. There are several main steps to building and deploying a Solana smart contract:

1. Write the contract in Rust.
2. Build and compile the contract.
3. Deploy the contract binary to the Solana network.
4. Initialize the contract (if necessary).
5. Interact with the deployed contract.

 * To create or build a smart contract using code editor name *codigo.ai*, follow these steps:

1. Create a YAML file (e.g. [@nft.yaml]) to define the contract.

  * *YAML is a data serialization language that is `human-readable` and used to define data structures. It is not a true markup language, as its acronym was changed to "YAML 
        Ain't Markup Language. It is often used for creating configuration files for applications that use other programming languages.*
   
3. Generate the smart contract using the appropriate command.
4. Implement the necessary functions, such as `mint`, `transfer`and `burn`.
5. Build the contract by running the command `cargo build-sbf` in the program directory, which contains files like `Cargo.toml`
6. Set your config file by executing the command -> "solana config set --url devnet".

       'solana config set --url devnet'
         
        
   

  * For creating smart contracts easily and efficiently, we recommend using `codigo.ai` . 
 
* This BELLOW command will set our config file to connect to devnet, where we will deploy contract. now we close to deploy ,now we Get devnet tokens for deploying a contract will   require some tokens, you get devnet tokens using the command ->  'solana airdrop 1'
    
---------------------------------

    'solana airdrop 1'

---------------------------------

  * after that you can check your balance with command -> 'solana balance' 
 
 ---------------------------------
 
    'solana balance' 
 
 ---------------------------------

* Finally now time for deploying the Contract,
 `Once we have the build`, from the generated directory, type the following command for deployment: 
  command -> 'solana program deploy target/deploy/nft.so'

      'solana program deploy target/deploy/nft.so'
  

  # After completing the deployment, you will get a program ID which is display on Terminal.

5. # How to interact with contract :
   To interact with a Solana smart contract, you'll need:

* The `Progarm ID` of the deployed contract
* The contract's SDK (if applicable)
* The client application to call the contract functions. 
* WE BUILD CLIENT APPLICATION FOR INTERACT TO CONTRACT.
* We build client app using:
* The Anchor framework
* The Solana web3 API
* Any SDK that allows calling Solana RPCs

* <The client application calls the contract's functions, passing in the required arguments and accounts. It then reads the result data from the contract.>



* importants links:
codigo.ai: https://codigo.ai/
Rise in :https://www.risein.com/bootcamps (learn new things here)
