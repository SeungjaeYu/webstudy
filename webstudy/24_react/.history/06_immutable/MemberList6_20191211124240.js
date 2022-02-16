class MemberList extends React.Component {

    getData() {
        const data = [
            {name: '홍1', email: 'hong1'}
        ];
    }


    render() {
        return (
            <div>
                <div>
                    <span>홍1</span>
                    <span>hong1@a.com</span>
                </div>
                <div>
                    <span>홍2</span>
                    <span>hong2@a.com</span>
                </div>
                <div>
                    <span>홍3</span>
                    <span>hong3@a.com</span>
                </div>
            </div>
        );
    }
}